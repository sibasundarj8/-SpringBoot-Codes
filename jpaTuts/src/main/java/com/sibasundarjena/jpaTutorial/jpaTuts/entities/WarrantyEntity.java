package com.sibasundarjena.jpaTutorial.jpaTuts.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "warranty_table")
@Data
@Builder
public class WarrantyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private final Integer warrantyPeriod; // number of months
    private final String warrantyTerms;   // terms (e.g. No physical damage recovery)

    private final LocalDate productBuyDate;

    @OneToOne(mappedBy = "warranty")
    private ProductEntity product;  // inverse side
}