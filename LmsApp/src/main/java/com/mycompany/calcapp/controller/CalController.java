package com.mycompany.calcapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.calcapp.domain.MathOperation;
import com.mycompany.calcapp.services.CalculatorServices;

@Controller
public class CalController {
	@Autowired
	CalculatorServices services;
	
	@ResponseBody
	@RequestMapping(value = "/AllOperationsPerformed", method = RequestMethod.GET)
	public List<MathOperation> readAll() {
		return services.ViewDataBase();
	}
	@RequestMapping(value = "/Addition", method = RequestMethod.POST)
	@ResponseBody
	public MathOperation add(@RequestBody MathOperation mathObject) {
		return services.add(mathObject);
	}
	
	@RequestMapping(value = "/Substraction", method = RequestMethod.POST)
	@ResponseBody
	public MathOperation Substract(@RequestBody MathOperation mathObject) {
		return services.substract(mathObject);
	}


}
