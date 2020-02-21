package com.mycompany.calcapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.calcapp.domain.MathOperation;
import com.mycompany.calcapp.persist.MyRepository;
import com.mycompany.calcapp.services.CalculatorServices;

@Service("MathService")
public class MathServices implements CalculatorServices  {
	
	@Autowired 
	MyRepository repository;
	
	@Override
	public MathOperation add(MathOperation obj) {
		double num1 = obj.getNumber1();
		double num2 = obj.getNumber2();
		double result = num1 + num2;
		obj.setResult(result);
		obj.setOperation("Addition");
		repository.save(obj);
		return obj;
	}

	@Override
	public MathOperation substract(MathOperation obj) {
		double num1 = obj.getNumber1();
		double num2 = obj.getNumber2();
		double result = num1 - num2;
		obj.setResult(result);
		obj.setOperation("substraction");
		repository.save(obj);
		return obj;
	}
	
	@Override
	public List<MathOperation> ViewDataBase() {
		return repository.findAll();
	}

	

}
