package com.mindtree.service;

import java.util.List;

import com.mindtree.domain.Subtraction;

public interface SubtractionService {
	public List<Subtraction> findAll();
	public Subtraction subtractRequest(Subtraction subtraction);

}
