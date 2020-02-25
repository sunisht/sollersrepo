package com.mindtree.persistence;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.domain.Addition;

@Repository
public interface AdditionRepository extends JpaRepository<Addition,Long>{
	List<Addition> findAll();
	@SuppressWarnings("unchecked")
	Addition save(Addition addition);
}
