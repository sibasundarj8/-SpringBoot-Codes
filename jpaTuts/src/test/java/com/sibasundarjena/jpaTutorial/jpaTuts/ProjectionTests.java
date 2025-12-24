package com.sibasundarjena.jpaTutorial.jpaTuts;

import com.sibasundarjena.jpaTutorial.jpaTuts.dtos.CProductInfo;
import com.sibasundarjena.jpaTutorial.jpaTuts.dtos.CProductPriceType;
import com.sibasundarjena.jpaTutorial.jpaTuts.dtos.readOnly.IProductInfo;
import com.sibasundarjena.jpaTutorial.jpaTuts.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ProjectionTests {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void productInterfaceProjection() {
        List<IProductInfo> list = productRepository.findAllProductsNamePrice();

        for (IProductInfo p : list) {
            System.out.println(p);
        }
    }

    @Test
    public void productClassProjection() {
        List<CProductInfo> list = productRepository.findAllProductsNamePriceConcrete();

        for (CProductInfo p : list) {
            System.out.println(p);
        }
    }

    @Test
    public void dbAggregateQueryTest() {
        List<CProductPriceType> list = productRepository.findAllProductTypeCount();

        for (CProductPriceType p : list) {
            System.out.println(p);
        }
    }

    @Test
    public void dmlQueryTest() {
        int rowAffected = productRepository.setTitleById(1L, "Sibasundar Jena");
        System.out.println(rowAffected + "rows affected");
    }
}