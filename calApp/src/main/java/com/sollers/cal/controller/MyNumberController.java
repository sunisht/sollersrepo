package com.sollers.cal.controller;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sollers.cal.domain.MyNumber;
import com.sollers.cal.service.MyNumberService;


@Controller
public class MyNumberController {
	
	@Autowired
	private MyNumberService numberService;
	
	 @RequestMapping(value = "/Course", method = RequestMethod.POST)
	    @ResponseBody
	    public MyNumber newMyNumber(@RequestBody MyNumber number) {
		return numberService.save(number);
	      //  return courseRepository.findById(course.getId());
	    }
	
	@ResponseBody
	@RequestMapping(value = "/App", method = RequestMethod.GET)
	public List<MyNumber> getNumber()
	{
		 return numberService.findAll();
	}

	
	@RequestMapping(value = "/App/addition/{firstNumber}/{secondNumber}", method = RequestMethod.GET)
    @ResponseBody
    public MyNumber addtion(
    		@PathVariable Integer firstNumber,@PathVariable Integer secondNumber) {
		
		int result= firstNumber + secondNumber;
		JSONObject jo = new JSONObject();
		jo.put("firstNumber", firstNumber);
		jo.put("secondNumber", secondNumber);
		jo.put("result", result);

		ObjectMapper mapper = new ObjectMapper();
		

		MyNumber obj= new MyNumber();
		
		try {
			obj = mapper.readValue(jo.toString(), MyNumber.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return numberService.save(obj);
    }
	@RequestMapping(value = "/App/subtraction/{firstNumber}/{secondNumber}", method = RequestMethod.GET)
    @ResponseBody
    public MyNumber subtraction(
    		@PathVariable Integer firstNumber,@PathVariable Integer secondNumber) {
		
		int result= firstNumber - secondNumber;
		JSONObject jo = new JSONObject();
		jo.put("firstNumber", firstNumber);
		jo.put("secondNumber", secondNumber);
		jo.put("result", result);

		ObjectMapper mapper = new ObjectMapper();
		

		MyNumber obj= new MyNumber();
		
		try {
			obj = mapper.readValue(jo.toString(), MyNumber.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return numberService.save(obj);
    }

}
