package com.sollers.cal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.sollers.cal.persistence.NumberRepository;
import com.sollers.cal.service.NumberService;

public class NumberServiceImpl implements NumberService {
	
	@Autowired
	private NumberRepository numberRepository;

	@Override
	public Number save(Number number) {
		// TODO Auto-generated method stub
		return numberRepository.save(number);
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

}
