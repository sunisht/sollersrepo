package com.mindtree.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.project.domain.Calculation;
import com.mindtree.project.persistance.CalculationRepository;
import com.mindtree.project.service.CalculationService;

@Service
public class CalculationServiceImpl implements CalculationService {

	@Autowired
	private CalculationRepository calculationRepository;

	public int addition(int x, int y) {

		int result = x + y;
		save(x, y, result);
		return result;
	}

	public int subtraction(int x, int y) {

		int result = x - y;
		save(x, y, result);
		return result;
	}

	@Override
	public void save(int x, int y, int result) {

		Calculation calc = new Calculation();
		calc.setNumberOne(x);
		calc.setNumberTwo(y);
		calc.setResult(result);

		calculationRepository.save(calc);

	}

}
