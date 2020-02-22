package com.mindtree.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.domain.Subtraction;
import com.mindtree.persistence.SubtractionRepository;
import com.mindtree.service.SubtractionService;

@Service
public class SubtractionServiceImpl implements SubtractionService{
	
	@Autowired
	private SubtractionRepository subtractionRepository;
	
	@Override
	public List<Subtraction> findAll() {
		return subtractionRepository.findAll();
	}

	@Override
	@Transactional
	public Subtraction subtractRequest(Subtraction subtraction) {
		subtraction.setId(subtractionRepository.count()+1);
		subtraction.setDifference();
		subtractionRepository.save(subtraction);
		return subtraction;
	}
}
