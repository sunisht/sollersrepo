package com.sollers.calcapp.serviceImpl;


import java.io.IOException;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.sollers.calcapp.Service.CalculatorService;
import com.sollers.calcapp.domain.Calculator;



@Service("MathService")
@Transactional
public class calculatorServiceImpl implements CalculatorService {


	@Autowired
	private CalculatorRepository calculatorRepository;
    
	
	
public calculatorServiceImpl() {
	
	
}

	@Transactional
	public Calculator add(Integer firstNumber, Integer secondNumber, Integer result) {
		// TODO Auto-generated method stub
		result = firstNumber + secondNumber;

		Calculator calc = new Calculator();
		calc.setFirstNumber(firstNumber);
		calc.setSecondNumber(secondNumber);
		calc.setResult(result);

		ObjectMapper mapper = new ObjectMapper();
		try {

			String JsonString = mapper.writeValueAsString(calc);}
		catch (IOException e){

			e.getMessage();
		} 
		calculatorRepository.save(calc);

		return calc;


	}



	@Override
	public Calculator subtract(Integer firstNumber, Integer secondNumber, Integer result) {
		result = firstNumber  - secondNumber;

		Calculator calc = new Calculator();
		calc.setFirstNumber(firstNumber);
		calc.setSecondNumber(secondNumber);
		calc.setResult(result);

		ObjectMapper mapper = new ObjectMapper();
		try {

			String JsonString = mapper.writeValueAsString(calc);}
		catch (IOException e){

			e.getMessage();
		}
        calculatorRepository.save(calc);
		return calc;


	}






}





