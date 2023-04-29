package com.devprojects.studies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devprojects.studies.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
