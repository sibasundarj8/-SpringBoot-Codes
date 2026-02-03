package com.sibasundarjena.jpaTutorial.jpaTuts;

import com.sibasundarjena.jpaTutorial.jpaTuts.entities.ProductEntity;
import com.sibasundarjena.jpaTutorial.jpaTuts.entities.WarrantyEntity;
import com.sibasundarjena.jpaTutorial.jpaTuts.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class OrphanRemovalTests {

    @Autowired
    private ProductService productService;

    @Test
    void OrphanRemovalDuringWarrantyUpdationTests() {
        WarrantyEntity warranty = WarrantyEntity.builder()
                .warrantyPeriod(18)
                .warrantyTerms("No physical damage recovery")
                .productBuyDate(LocalDate.of(2026, 2, 2))
                .build();

        ProductEntity product = productService.changeWarranty(warranty, 1L);
        System.out.println(product);
    }

    @Test
    void OrphanRemovalDuringWarrantyDeletionTests() {
        ProductEntity product = productService.removeWarranty(1L);
        System.out.println(product);
    }
}