package com.sollers.cal.controller;

import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	
	 
	 @RequestMapping(value = "/App", method = RequestMethod.POST)
	 @CrossOrigin(origins="http://localhost:4200")
	    @ResponseBody
	    
	    public MyNumber newMyNumber(@RequestBody MyNumber number) {
		return numberService.save(number);
	    }
	
	 
	 
	@ResponseBody
	@RequestMapping(value = "/App", method = RequestMethod.GET)
	 @CrossOrigin(origins="http://localhost:4200")
	public List<MyNumber> getNumber()
	{
		 return numberService.findAll();
	}

	
	@RequestMapping(value = "/App/addition/{firstNumber}/{secondNumber}", method = RequestMethod.GET)
    @ResponseBody
	 @CrossOrigin(origins="http://localhost:4200")

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
	@RequestMapping(value = "/App/addition/{firstNumber}/{secondNumber}", method = RequestMethod.POST)
    @ResponseBody
	 @CrossOrigin(origins="http://localhost:4200")

    public MyNumber myAddtion(
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
	@RequestMapping(value = "/App/subtraction/{firstNumber}/{secondNumber}", method = RequestMethod.POST)
    @ResponseBody
    
    public MyNumber mySubtraction(
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
