package com.sibasundarjena.jpaTutorial.jpaTuts.repositories;

import com.sibasundarjena.jpaTutorial.jpaTuts.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    /*
     * returns all the products with given title.
     */
    List<ProductEntity> findByTitle(String nestle234);

    /*
     * returns all the products which are created after the given time.
     */
    List<ProductEntity> findByCreatedAtAfter(LocalDateTime after);

    /*
     * return all the products which (quantity is greater than Q || price is less than P)
     */
    List<ProductEntity> findByQuantityGreaterThanOrPriceLessThan(int quantity, BigDecimal price);

    /*
     * return all the products which title is matches with given pattern.
     * make sure to add wild card (%) at the beginning and ending of the title.
     */
    List<ProductEntity> findByTitleLike(String title);

    /*
     * returns all the products which title is matches the given pattern
     * no need to add wild card (%) explicitly, hibernate takes care of it.
     */
    List<ProductEntity> findByTitleContainingIgnoreCase(String title);

    /*
     * return the product which title and price both are equal with given title and price.
     */
    Optional<ProductEntity> findByTitleAndPrice(String title, BigDecimal price);

    /*
     * return the sku of the product which title is equal with given title.
     */
    @Query("select e.sku from ProductEntity e where e.title=:title")
    String findSkuByTitle(String title);
}