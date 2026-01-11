package com.sibasundarjena.jpaTutorial.jpaTuts.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "warranty_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WarrantyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer warrantyPeriod; // number of months
    private String warrantyTerms;   // terms (e.g. No physical damage recovery)

    private LocalDate productBuyDate;

    @OneToOne(mappedBy = "warranty")
    private ProductEntity product;  // inverse side
}