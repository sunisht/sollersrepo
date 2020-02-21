package com.sollers.calcapp.persistence;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sollers.calcapp.domain.Calculator;

@Service
public interface AdditionService {

	


public List<Calculator>  addNumbers(Integer firstNumber, Integer secondNumber);

public List<Calculator> subtractNumbers(Integer firstNumber, Integer secondNumber);


}
