package com.sollers.calcapp.Service;

import java.util.List;



import com.sollers.calcapp.domain.Calculator;


public interface CalculatorService {

	
public Calculator add(Integer firstNumber,Integer secondNumber, Integer result);

public Calculator subtract(Integer firstNumber, Integer secondNumber,Integer result);

public Calculator findById(Integer id);








}
