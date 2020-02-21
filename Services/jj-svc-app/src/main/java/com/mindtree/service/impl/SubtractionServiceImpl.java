package com.mindtree.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindtree.persistence.SubtractionRepository;

import com.mindtree.domain.Subtraction;
import com.mindtree.service.SubtractionService;

@Service
public class SubtractionServiceImpl implements SubtractionService{
	
	@Autowired
	private SubtractionRepository subtractionRepository;
	
	@Autowired
	private Subtraction subtraction;
	
	@Override
	public List<Subtraction> findAll() {
		return subtractionRepository.findAll();
	}


	public Subtraction subtract(Long firstNumber, Long secondNumber) {

		subtraction.setFirstNumber(firstNumber);
		subtraction.setSecondNumber(secondNumber);
		subtraction.setDifference();
		subtractionRepository.save(subtraction);
		return subtraction;
	}

}
