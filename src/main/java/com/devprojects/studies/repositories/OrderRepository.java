package com.devprojects.studies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devprojects.studies.entities.Order;

@Repository // **Optional
public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
}
