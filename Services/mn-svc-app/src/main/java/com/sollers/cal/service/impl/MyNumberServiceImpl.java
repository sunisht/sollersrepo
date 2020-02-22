package com.sollers.cal.service.impl;

import java.util.List;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sollers.cal.domain.MyNumber;
import com.sollers.cal.persistence.MyNumberRepository;
import com.sollers.cal.service.MyNumberService;

@Service
public class MyNumberServiceImpl implements MyNumberService{
	
	@Autowired
	private MyNumberRepository myNumberRepository;

	@Override
	public MyNumber save(MyNumber number) {
		// TODO Auto-generated method stub
		return myNumberRepository.save(number);
	}

	@Override
	public List<MyNumber> findAll() {
		// TODO Auto-generated method stub
		return myNumberRepository.findAllByOrderByIdDesc();
	}

	@Override
	public Optional<MyNumber> findTop() {
		// TODO Auto-generated method stub
		return myNumberRepository.findTopByOrderByIdDesc();
	}
	
	public int add(int a, int b) {
		
		return a+b;
	}
	
	public int subtraction(int a,int b)
	{
		return a-b;
	}

	public JSONObject converToJson(int firstNumber,int secondNumber, int result)
	{
		JSONObject jo = new JSONObject();
		jo.put("firstNumber", firstNumber);
		jo.put("secondNumber", secondNumber);
		jo.put("result", result);
		return jo;
	}


}
