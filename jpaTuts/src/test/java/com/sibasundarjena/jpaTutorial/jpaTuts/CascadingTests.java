package com.sibasundarjena.jpaTutorial.jpaTuts;

import com.sibasundarjena.jpaTutorial.jpaTuts.entities.WarrantyEntity;
import com.sibasundarjena.jpaTutorial.jpaTuts.services.WarrantyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class CascadingTests {

    @Autowired
    private WarrantyService warrantyService;

    @Test
    void warrantyAssigningTest() {
        WarrantyEntity warranty = WarrantyEntity.builder()
                .productBuyDate(LocalDate.of(2025, 2, 2))
                .warrantyPeriod(24)
                .warrantyTerms("No physical damage recovery!!")
                .build();

        WarrantyEntity assignedWarranty = warrantyService.assignWarranty(warranty, 1L);

        System.out.println(assignedWarranty.getWarrantyTerms());
    }
}