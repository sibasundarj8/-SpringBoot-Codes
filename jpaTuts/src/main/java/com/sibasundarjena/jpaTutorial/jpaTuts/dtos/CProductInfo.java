package com.sibasundarjena.jpaTutorial.jpaTuts.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CProductInfo {
    private final String title;
    private final BigDecimal price;
    private final Integer quantity;
}