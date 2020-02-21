package com.mindtree.project.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.project.domain.Calculation;

@Repository
public interface CalculationRepository extends JpaRepository<Calculation, Integer> {

}
