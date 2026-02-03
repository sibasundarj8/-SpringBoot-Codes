package com.sibasundarjena.jpaTutorial.jpaTuts;

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
    void N_plus_1_queryTesting() {
        List<ProductEntity> products = productService.findAllProductsWithWarranty();

        for (ProductEntity product : products) {
            System.out.println(product);
        }
    }
}