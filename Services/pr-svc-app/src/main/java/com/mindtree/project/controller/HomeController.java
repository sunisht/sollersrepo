package com.mindtree.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mindtree.project.exception.IncorrectInputException;
import com.mindtree.project.service.CalculationService;

@Controller
public class HomeController {

	@Autowired
	private CalculationService calculationService;

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/addition/{num1}/{num2}", method = RequestMethod.GET)
	@ResponseBody
	public Integer addition(@PathVariable int num1, @PathVariable int num2) {
		return calculationService.addition(num1, num2);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/subtraction/{num1}/{num2}", method = RequestMethod.GET)
	@ResponseBody
	public Integer subtraction(@PathVariable int num1, @PathVariable int num2) {
		if (num1 == 0)
			throw new IncorrectInputException();
		else
			return calculationService.subtraction(num1, num2);
	}

	
}
