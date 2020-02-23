package com.sollers.calcapp.serviceImpl;


import java.io.IOException;
import java.util.HashMap;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.sollers.calcapp.Service.CalculatorService;
import com.sollers.calcapp.domain.Calculator;

import com.sollers.calcapp.persistence.CalculatorRepository;

@Service
@Transactional
public class calculatorServiceImpl implements CalculatorService {


	@Autowired
	private CalculatorRepository calculatorRepository;



	public calculatorServiceImpl() {


	}

	@Transactional
	public Calculator add(Integer firstNumber, Integer secondNumber,Integer result) {
		// TODO Auto-generated method stub
		result = firstNumber + secondNumber;

		Calculator calculator = new Calculator();
		calculator.setFirstNumber(firstNumber);
		calculator.setSecondNumber(secondNumber);
		calculator.setResult(result);

		try {

			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValueAsString(result);

		}
		catch (IllegalArgumentException e){

			e.getMessage();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		} 
		calculatorRepository.save(calculator);

		return calculator;




	}



	@Transactional
	public Calculator subtract(Integer firstNumber, Integer secondNumber, Integer result) {
		result = firstNumber + secondNumber;

		Calculator calculator = new Calculator();
		calculator.setFirstNumber(firstNumber);
		calculator.setSecondNumber(secondNumber);
		calculator.setResult(result);

		try {

			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValueAsString(result);

		}
		catch (IllegalArgumentException e){

			e.getMessage();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		} 
		calculatorRepository.save(calculator);

		return calculator;





	}


	@Transactional
	public Calculator findById(Integer id) {
		// TODO Auto-generated method stub
		return calculatorRepository.findById(id);

	}


}




















