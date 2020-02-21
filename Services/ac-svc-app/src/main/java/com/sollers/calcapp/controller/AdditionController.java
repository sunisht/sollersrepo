package com.sollers.calcapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sollers.calcapp.domain.Calculator;
import com.sollers.calcapp.persistence.AdditionService;

import java.util.List;

@Controller
public class AdditionController {

	@Autowired	
	private AdditionService additionService;



	@RequestMapping(value="/home/{id}/firstNumber/secondNumber", method = RequestMethod.POST)
	@ResponseBody
	public List<Calculator>addNumbers(@PathVariableInteger firstNumber, Integer secondNumber){

     return additionService.addNumbers(firstNumber, secondNumber);

	}



