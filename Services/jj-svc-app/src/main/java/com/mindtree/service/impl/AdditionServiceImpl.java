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
	
	@Override
	public List<Addition> findAll() {
		return additionRepository.findAll();
	}

	@Override
	@Transactional
	public Addition addRequest(Addition addition) {
		addition.setId(additionRepository.count()+1);
		addition.setSum();
		additionRepository.save(addition);
		return addition;
	}

	@Override
	public Addition deleteAddition(Long additionId) {
		Addition addition = additionRepository.findOneById(additionId);
		additionRepository.delete(addition);
		return null;
	}
}
