package com.sollers.calcapp.serviceImpl;
import java.io.IOException;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.sollers.calcapp.Service.CalculatorService;
import com.sollers.calcapp.domain.Calculator;
import com.sollers.persistence.calculatorRepository;


@Service("Math Service")
@Transactional
public class calculatorServiceImpl implements CalculatorService {


	@Autowired
	private calculatorRepository CalculatorRepository;



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
        
       return calc;


	}


	}





