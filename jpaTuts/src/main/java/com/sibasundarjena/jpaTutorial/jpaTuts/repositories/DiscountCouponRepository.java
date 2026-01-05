package com.sibasundarjena.jpaTutorial.jpaTuts.repositories;

import com.sibasundarjena.jpaTutorial.jpaTuts.entities.DiscountCouponEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountCouponRepository extends JpaRepository<DiscountCouponEntity, Long> {
}