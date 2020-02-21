package com.mindtree.service;

import java.util.List;

import com.mindtree.domain.Addition;

public interface AdditionService {
	public List<Addition> findAll();

	public Addition add(Long firstNumber, Long secondNumber);

}
