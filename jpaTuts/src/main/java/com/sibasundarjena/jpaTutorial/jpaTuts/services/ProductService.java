package com.sibasundarjena.jpaTutorial.jpaTuts.services;

import com.sibasundarjena.jpaTutorial.jpaTuts.entities.ProductEntity;
import com.sibasundarjena.jpaTutorial.jpaTuts.repositories.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public void findProductById() {
        ProductEntity p1 = productRepository.findById(1L).orElseThrow();
        ProductEntity p2 = productRepository.findById(1L).orElseThrow();

        System.out.println(p1 == p2); // true --> same instance inside @Transactional because it returns from Persistence Context.

        p2.setTitle("Sibasundar Jena"); // changes the data inside database also. because Persistence Context is synchronized with database.
    }

    @Transactional
    public void deleteProductById(Long productId) {
        if (!productRepository.existsById(productId)) {
            throw new EntityNotFoundException("Product not found");
        }
        productRepository.deleteById(productId);
    }
}