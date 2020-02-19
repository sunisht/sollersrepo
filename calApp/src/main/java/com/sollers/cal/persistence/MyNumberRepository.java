package com.sollers.cal.persistence;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sollers.cal.domain.MyNumber;

public interface MyNumberRepository extends JpaRepository<MyNumber,Integer> {
	
	Optional<Number> findTopByOrderByIdAsc();

}
