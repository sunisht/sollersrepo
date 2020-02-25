package com.mindtree.persistence;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.domain.Subtraction;

@Repository
public interface SubtractionRepository extends JpaRepository<Subtraction, Long>{
	List<Subtraction> findAll();
	@SuppressWarnings("unchecked")
	Subtraction save(Subtraction subtraction);
}
