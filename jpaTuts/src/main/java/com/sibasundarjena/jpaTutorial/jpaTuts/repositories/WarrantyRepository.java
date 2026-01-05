package com.sibasundarjena.jpaTutorial.jpaTuts.repositories;

import com.sibasundarjena.jpaTutorial.jpaTuts.entities.WarrantyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarrantyRepository extends JpaRepository<WarrantyEntity, Long> {
}