package com.sollers.calcapp.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sollers.calcapp.domain.Calculator;

@Service
public interface CalculatorService {

	


public Calculator   add(Integer firstNumber, Integer secondNumber,Integer result);

public Calculator subtract(Integer firstNumber, Integer secondNumber, Integer result);





}
