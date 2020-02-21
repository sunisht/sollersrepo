package com.mindtree.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	public Integer addition(@PathVariable String num1, @PathVariable String num2) {
		try {
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			return calculationService.addition(n1, n2);
		} catch (Exception e) {
			throw new IncorrectInputException(e);
		}
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/subtraction/{num1}/{num2}", method = RequestMethod.GET)
	@ResponseBody
	public Integer subtraction(@PathVariable String num1, @PathVariable String num2) {

		try {
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			return calculationService.subtraction(n1, n2);
		} catch (Exception e) {
			throw new IncorrectInputException(e);
		}
	}

}
