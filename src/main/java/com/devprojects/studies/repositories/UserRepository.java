package com.devprojects.studies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devprojects.studies.entities.User;

@Repository // **Optional
public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
