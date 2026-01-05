package com.sibasundarjena.jpaTutorial.jpaTuts.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "discount_coupon_table")
@Data
public class DiscountCouponEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;

    private Double minSpend;    // minimum spend to get discount.
    private Double percentage;  // discount this percent of total amount.
    private Double offset;      // discount is more than offset then get offset amount.

    @ManyToMany
    @JoinTable(
            name = "coupon_product_table",
            joinColumns = @JoinColumn(name = "coupon_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private Set<ProductEntity> products = new HashSet<>();
}