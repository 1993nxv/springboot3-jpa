package com.devprojects.studies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devprojects.studies.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}
