package com.mindtree.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mindtree.domain.Addition;
import com.mindtree.domain.Subtraction;
import com.mindtree.service.AdditionService;
import com.mindtree.service.SubtractionService;

@Controller
@CrossOrigin(origins="*",allowedHeaders="*")
public class CalcController {
	@Autowired
	AdditionService additionService;
	@Autowired
	SubtractionService subtractionService;
	
	@ResponseBody
	@RequestMapping(value = "/Addition", method = RequestMethod.GET)
	public List<Addition> getAdditions() {
		return additionService.findAll();
	}
	
	@ResponseBody
	@RequestMapping(value = "/Subtraction", method = RequestMethod.GET)
	public List<Subtraction> getSubtractions() {
		return subtractionService.findAll();
	}
	
	@RequestMapping(value = "/Addition/{firstNumber}/{secondNumber}", method = RequestMethod.GET)
	@ResponseBody
	public Addition add(@PathVariable Long firstNumber, @PathVariable Long secondNumber) {
		return additionService.add(firstNumber, secondNumber);
	}
	
	@RequestMapping(value = "/Subtraction/{firstNumber}/{secondNumber}", method = RequestMethod.GET)
	@ResponseBody
	public Subtraction subtract(@PathVariable Long firstNumber, @PathVariable Long secondNumber) {
		return subtractionService.subtract(firstNumber, secondNumber);
	}
	
}
