package com.sibasundarjena.jpaTutorial.jpaTuts.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import lombok.ToString;
import org.hibernate.annotations.Formula;

import java.math.BigDecimal;

@Entity
@Data
public class CartItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @ToString.Exclude
    private ProductEntity product;

    private Integer quantity;

    @Formula("(select p.price * quantity from product p where p.id = product_id)")
    private BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @ToString.Exclude
    private CartEntity cart;
}