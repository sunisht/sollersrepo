package com.sollers.cal.service.impl;

import java.util.List;

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
	public Integer add(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer subtract(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MyNumber> findAll() {
		// TODO Auto-generated method stub
		//return myNumberRepository.findAll();
		return myNumberRepository.findAllByOrderByIdDesc();
	}

}
