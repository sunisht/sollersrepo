package com.sollers.calcapp.persistence;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sollers.calcapp.domain.Calculator;


public interface CalculatorRepository extends JpaRepository<Calculator, Long>{

public Calculator add(Integer firstNumber, Integer secondNumber,Integer result);

public Calculator subtract(Integer firstNumber, Integer secondNumber,Integer result);

public Calculator findById(Integer id);
}
