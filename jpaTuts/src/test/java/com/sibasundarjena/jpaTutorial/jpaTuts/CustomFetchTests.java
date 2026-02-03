package com.sibasundarjena.jpaTutorial.jpaTuts;

import com.sibasundarjena.jpaTutorial.jpaTuts.dtos.readOnly.IProductWarranty;
import com.sibasundarjena.jpaTutorial.jpaTuts.entities.ProductEntity;
import com.sibasundarjena.jpaTutorial.jpaTuts.repositories.ProductRepository;
import com.sibasundarjena.jpaTutorial.jpaTuts.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class CustomFetchTests {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductRepository productRepository;

    @Test
    void N_plus_1_JoinFetch_Test() {
        List<ProductEntity> products = productService.findAllProductsWithWarranty();

        for (ProductEntity product : products) {
            System.out.println(product);
        }
    }

    @Test
    void N_plus_1_dto_mapping_Test() { // much faster than other methods to avoid N+1 problem.
        List<IProductWarranty> products = productService.findAllProductsWarranty();

        for (IProductWarranty product : products) {
            System.out.println("ProductEntity: " + product);
        }
    }
}