package com.sibasundarjena.jpaTutorial.jpaTuts.services;

import com.sibasundarjena.jpaTutorial.jpaTuts.entities.ProductEntity;
import com.sibasundarjena.jpaTutorial.jpaTuts.entities.WarrantyEntity;
import com.sibasundarjena.jpaTutorial.jpaTuts.repositories.ProductRepository;
import com.sibasundarjena.jpaTutorial.jpaTuts.repositories.WarrantyRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WarrantyService {
    private final ProductRepository productRepository;
    private final WarrantyRepository warrantyRepository;

    @Transactional  // database is synchronized now
    public WarrantyEntity assignWarranty(WarrantyEntity warranty, Long productId) {

        // throws noSuchElementException if product not found.
        ProductEntity product = productRepository.findById(productId).orElseThrow();

        // also mirrored in database because it is in persistence context.
        product.setWarranty(warranty);

        // optional -> bidirectional mapping.
        warranty.setProduct(product);

        return warranty;
    }
}