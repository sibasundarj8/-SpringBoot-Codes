package com.sibasundarjena.jpaTutorial.jpaTuts.dtos.readOnly;

import com.sibasundarjena.jpaTutorial.jpaTuts.entities.WarrantyEntity;
import com.sibasundarjena.jpaTutorial.jpaTuts.entities.eums.ProductType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface IProductWarranty {

    Long getId();

    String getSku();

    String getTitle();

    BigDecimal getPrice();

    Integer getQuantity();

    ProductType getProductType();

    LocalDateTime getCreatedAt();

    LocalDateTime getUpdatedAt();

    WarrantyEntity getWarranty();
}