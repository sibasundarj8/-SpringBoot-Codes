package com.sibasundarjena.jpaTutorial.jpaTuts.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sibasundarjena.jpaTutorial.jpaTuts.entities.eums.ProductType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(
        name = "product_table",
        uniqueConstraints = {
                @UniqueConstraint(name = "title_price_unique", columnNames = {"title_x", "price"})
        },
        indexes = {
                @Index(name = "sku_index", columnList = "sku")
        }
)

public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String sku;

    @Column(name = "title_x")
    private String title;

    private BigDecimal price;
    private Integer quantity;

    @Enumerated(EnumType.STRING)
    private ProductType productType;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "warranty_id")
    // @ToString.Exclude
    @JsonIgnore
    private WarrantyEntity warranty;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id")
    @ToString.Exclude
    @JsonIgnore
    private CartEntity cart;

    @ManyToMany(mappedBy = "products", fetch = FetchType.LAZY)
    @JsonIgnore
    @ToString.Exclude
    private Set<DiscountCouponEntity> coupons = new HashSet<>();
}