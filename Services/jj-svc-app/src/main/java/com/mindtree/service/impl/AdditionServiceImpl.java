package com.mindtree.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.domain.Addition;
import com.mindtree.persistence.AdditionRepository;
import com.mindtree.service.AdditionService;

@Service
public class AdditionServiceImpl implements AdditionService{

	@Autowired
	private AdditionRepository additionRepository;

	@Autowired
	private Addition addition;
	
	@Override
	public List<Addition> findAll() {
		return additionRepository.findAll();
	}

	
	@Transactional
	public Addition add(Long firstNumber, Long secondNumber) {
		addition.setFirstNumber(firstNumber);
		addition.setSecondNumber(secondNumber);
		System.out.println("first num passed in service "+firstNumber);
		System.out.println("first num passed in service "+secondNumber);
		System.out.println("first num in service "+addition.getFirstNumber());
		System.out.println("first num in service "+addition.getSecondNumber());
		
		addition.setSum();
		additionRepository.save(addition);
		return addition;
	}
}
