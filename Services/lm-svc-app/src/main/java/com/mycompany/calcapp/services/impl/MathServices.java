package com.mycompany.calcapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.calcapp.domain.MathOperation;
import com.mycompany.calcapp.persist.MyRepository;
import com.mycompany.calcapp.services.CalculatorServices;
/**
 * MathService. This will be made use in the controller class.
 * this class makes of the JPA repository
 * @author Lawrence Nkafu
 *
 */
@Service("MathService")
public class MathServices implements CalculatorServices  {

	@Autowired 
	MyRepository repository;

	/**
	 * adds number1 and number2 of obj and sets variables result, operation of obj object
	 * obj is then saved in the database
	 *@Override
	 */
	public MathOperation add(MathOperation obj) {
		double num1 = obj.getNumber1();
		double num2 = obj.getNumber2();
		double result = num1 + num2;
		obj.setResult(result);
		obj.setOperation("+");
		repository.save(obj);
		return obj;
	}
	
	/**
	 * subtracts number1 and number2 of obj and sets variables result, operation of obj object
	 * obj is then saved in the database
	 *@Override
	 */
	@Override
	public MathOperation subtract(MathOperation obj) {
		double num1 = obj.getNumber1();
		double num2 = obj.getNumber2();
		double result = num1 - num2;
		obj.setResult(result);
		obj.setOperation("-");
		repository.save(obj);
		return obj;
	}

	/**
	 * returns all saved operations in the database
	 */
	@Override
	public List<MathOperation> viewDatabase() {
		return repository.findAll();
	}



}
