package com.sollers.cal.persistence;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface NumberRepository extends JpaRepository<Number,Integer> {
	
	Optional<Number> findTopByOrderByIdAsc();

}
