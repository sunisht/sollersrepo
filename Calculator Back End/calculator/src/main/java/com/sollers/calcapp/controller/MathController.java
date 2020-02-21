package com.sollers.calcapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.sollers.calcapp.Service.CalculatorService;
import com.sollers.calcapp.domain.Calculator;

import java.util.List;

@Controller
public class MathController {

	@Autowired	
	private CalculatorService calculatorService;
     
	
	
	


	

	
    @RequestMapping(value="/add/{firstNumber}/{secondNumber}", method = RequestMethod.POST)
    @ResponseBody
    public Calculator add(Integer firstNumber, Integer secondNumber, Integer result) {
    
    	return calculatorService.add(firstNumber, secondNumber,result);
    	
    	
    	
    	
    			}
    
    @RequestMapping(value="/subtract/{firstNumber}/{secondNumber}", method = RequestMethod.POST)
    @ResponseBody
    public Calculator subtract(Integer firstNumber, Integer secondNumber, Integer result) {
    	
    	return calculatorService.subtract( firstNumber,secondNumber,result);
    }
    		
    		
    	
    }




