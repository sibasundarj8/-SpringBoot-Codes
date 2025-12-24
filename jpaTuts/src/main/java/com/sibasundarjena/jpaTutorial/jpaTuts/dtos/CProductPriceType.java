package com.sibasundarjena.jpaTutorial.jpaTuts.dtos;

import com.sibasundarjena.jpaTutorial.jpaTuts.entities.eums.ProductType;
import lombok.Data;

@Data
public class CProductPriceType {
    private final ProductType productType;
    private final Long count;
}