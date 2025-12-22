package com.sibasundarjena.jpaTutorial.jpaTuts;

import com.sibasundarjena.jpaTutorial.jpaTuts.entities.ProductEntity;
import com.sibasundarjena.jpaTutorial.jpaTuts.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class JpaTutorialApplicationTests {

    @Autowired
    private ProductRepository productRepository;

	@Test
	void contextLoads() {
	}

    //@Test
    void testRepository() {
        ProductEntity newProduct = ProductEntity.builder()
                .sku("nestle234")
                .title("Nestle Chocolate")
                .price(BigDecimal.valueOf(125.24))
                .quantity(12)
                .build();

        ProductEntity savedProduct = productRepository.save(newProduct);

        System.out.println("[Product saved]: " + savedProduct);
    }

    @Test
    void testFindByTitle() {
        List<ProductEntity> entity = productRepository.findByTitle("Nestle Chocolate");
        System.out.println("[FindByTitle]: " + entity);
    }

    @Test
    void testFindByCreatedAtAfter() {
        List<ProductEntity> entity = productRepository
                .findByCreatedAtAfter(LocalDateTime
                        .of(2025, 12, 23, 0, 0, 0));
        System.out.println("[FindByCreatedAtAfter]: " + entity);
    }

    @Test
    void testFindByQuantityGreaterThanOrPriceLessThan() {
        List<ProductEntity> entity = productRepository
                .findByQuantityGreaterThanOrPriceLessThan(10, BigDecimal.valueOf(100.5));
        System.out.println("[FindByQuantityGreaterThanOrPriceLessThan]: " + entity);
    }

    @Test
    void testFindByTitleLike() {
        List<ProductEntity> entity = productRepository.findByTitleLike("%Choco%");
        System.out.println("[FindByTitleLike]: " + entity);
    }

    @Test
    void testFindByTitleContainingIgnoreCase(){
        List<ProductEntity> entity = productRepository.findByTitleContainingIgnoreCase("choco");
        System.out.println("[FindByTitleContainingIgnoreCase]: " + entity);
    }

    @Test
    void testFindByTitleAndPrice(){
        Optional<ProductEntity> product = productRepository.findByTitleAndPrice("Nestle Chocolate", BigDecimal.valueOf(125.24));
        System.out.println("[FindByTitleAndPrice]: " + product);
    }

    @Test
    void testFindSkuByTitle(){
        String sku = productRepository.findSkuByTitle("Nestle Chocolate");
        System.out.println("[FindSkuByTitle]: " + sku);
    }
} 