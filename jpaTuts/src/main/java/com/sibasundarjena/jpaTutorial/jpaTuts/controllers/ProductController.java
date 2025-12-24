package com.sibasundarjena.jpaTutorial.jpaTuts.controllers;

import com.sibasundarjena.jpaTutorial.jpaTuts.entities.ProductEntity;
import com.sibasundarjena.jpaTutorial.jpaTuts.repositories.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final int PAGE_SIZE = 5;
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/searchByName/{title}")
    public List<ProductEntity> getAllProductsWithName(@PathVariable("title") String title) {
        return productRepository.findByTitleOrderByPriceAsc(title);
    }

    @GetMapping("/allProducts")
    public Page<ProductEntity> getAllProducts(@RequestParam(value = "sortBy", defaultValue = "id") String sortBy,
                                              @RequestParam(value = "pageNumber", defaultValue = "0") int pageNumber) {

        Pageable pageable = PageRequest.of(pageNumber, PAGE_SIZE, Sort.by(sortBy));

        return productRepository.findAll(pageable);
    }


    @GetMapping("/productByPattern")
    public Page<ProductEntity> getProductContainingPattern(@RequestParam(value = "title", required = false) String title,
                                                           @RequestParam(value = "sortBy", defaultValue = "id") String sortBy,
                                                           @RequestParam(value = "pageNumber", defaultValue = "0") int pageNumber) {

        return productRepository.findByTitleContainingIgnoreCase(title, PageRequest.of(pageNumber, PAGE_SIZE, Sort.by(sortBy)));
    }
}