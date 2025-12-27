package com.sibasundarjena.jpaTutorial.jpaTuts.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "warranty_table")
@Data
public class ProductWarrantyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;

    private final Integer warrantyPeriod; // number of months
    private final String warrantyTerms;   // terms (e.g. No physical damage recovery)

    @OneToOne(mappedBy = "warranty")
    private ProductEntity product;  // inverse side
}