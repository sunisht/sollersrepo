package com.sollers.cal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sollers.cal.service.NumberService;


public class NumberController {
	
	@Autowired
	private NumberService numberService;
	
//	@RequestMapping(value = "/App/", method = RequestMethod.GET)
//    @ResponseBody
//	public List<Number> getNumber()
//	{
//		return numberService.findAll();
//	}

	
//	@RequestMapping(value = "/App/{sign}/firstNumber/secondNumber", method = RequestMethod.POST)
//    @ResponseBody
//    public Number save(@RequestBody Number number, @PathVariable String sign,
//    		@PathVariable Integer firstNumber,@PathVariable Integer secondNumber) {
//		
//		
//		
//		
//		if (sign.equals("add"))
//		{
//			
//		}
//		else if(sign.equals("sub"))
//		{
//			
//		}
//		else 
//		{
//			
//		}
//		return numberService.save(number);
//    }

}
