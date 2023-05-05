package com.devprojects.studies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devprojects.studies.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	
}
