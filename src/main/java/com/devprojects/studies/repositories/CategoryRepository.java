package com.devprojects.studies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devprojects.studies.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
}
