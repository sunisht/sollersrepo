package com.sollers.cal.controller;

import java.util.List;

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
	
	 /**
	  * Purpose: Create a new MyNumber object and save in database
	  * @param number
	  * @return
	  */
	@RequestMapping(value = "/App", method = RequestMethod.POST)
	@CrossOrigin(origins = "http://localhost:4200")
	@ResponseBody

	public MyNumber newMyNumber(@RequestBody MyNumber number) {
		return numberService.save(number);
	}
	
	
	/**
	 * Purpose: Get all records in MyNumber table
	 * @return
	 */
	 
	@ResponseBody
	@RequestMapping(value = "/App", method = RequestMethod.GET)
	@CrossOrigin(origins = "http://localhost:4200")
	public List<MyNumber> getNumber() {
		return numberService.findAll();
	}

	/**
	 * Purpose: addition firstNumber, secondNumber and return the MyNumber object, which has been create
	 * @param firstNumber
	 * @param secondNumber
	 * @return
	 */
	@RequestMapping(value = "/App/addition/{firstNumber}/{secondNumber}", method = RequestMethod.GET)
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:4200")

	public MyNumber addtion(@PathVariable Integer firstNumber, @PathVariable Integer secondNumber) {

		int result=numberService.add(firstNumber,secondNumber);		
		JSONObject jo=numberService.converToJson(firstNumber, secondNumber, result);
		ObjectMapper mapper = new ObjectMapper();
		MyNumber obj = new MyNumber();
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

	/**
	 * purpose: add firstNumber and secondNumber
	 * @param firstNumber
	 * @param secondNumber
	 * @return
	 */
	@RequestMapping(value = "/App/addition/{firstNumber}/{secondNumber}", method = RequestMethod.POST)
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:4200")

	public MyNumber myAddtion(@PathVariable Integer firstNumber, @PathVariable Integer secondNumber) {

		int result=numberService.add(firstNumber,secondNumber);
		JSONObject jo=numberService.converToJson(firstNumber, secondNumber, result);
		ObjectMapper mapper = new ObjectMapper();
		MyNumber obj = new MyNumber();

		try {
			obj = mapper.readValue(jo.toString(), MyNumber.class);
		} catch (JsonMappingException e) {
			System.out.println(e.getMessage());
			
		} catch (JsonProcessingException e) {
			System.out.println(e.getMessage());

		}

		return numberService.save(obj);
	}
	
	/**
	 * Purpose:subtract firstNumber and secondNumber
	 * @param firstNumber
	 * @param secondNumber
	 * @return
	 */

	@RequestMapping(value = "/App/subtraction/{firstNumber}/{secondNumber}", method = RequestMethod.POST)
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:4200")

	public MyNumber mySubtraction(@PathVariable Integer firstNumber, @PathVariable Integer secondNumber) {

		int result=numberService.subtraction(firstNumber,secondNumber);

		JSONObject jo=numberService.converToJson(firstNumber, secondNumber, result);

		ObjectMapper mapper = new ObjectMapper();

		MyNumber obj = new MyNumber();

		try {
			obj = mapper.readValue(jo.toString(), MyNumber.class);
		} catch (JsonMappingException e) {
			System.out.println(e.getMessage());

		} catch (JsonProcessingException e) {
			System.out.println(e.getMessage());

		}

		return numberService.save(obj);
	}
	
	/**
	 * purpose:subtract first and second number, return the MyNumber object
	 * @param firstNumber
	 * @param secondNumber
	 * @return
	 */

	@RequestMapping(value = "/App/subtraction/{firstNumber}/{secondNumber}", method = RequestMethod.GET)
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:4200")

	public MyNumber subtraction(@PathVariable Integer firstNumber, @PathVariable Integer secondNumber) {

		int result=numberService.add(firstNumber,secondNumber);
		JSONObject jo=numberService.converToJson(firstNumber, secondNumber, result);
		ObjectMapper mapper = new ObjectMapper();
		MyNumber obj = new MyNumber();

		try {
			obj = mapper.readValue(jo.toString(), MyNumber.class);
		} catch (JsonMappingException e) {
			System.out.println(e.getMessage());
		} catch (JsonProcessingException e) {
			System.out.println(e.getMessage());
		}

		return numberService.save(obj);
	}
	
	/**
	 * purpose: get the top records in MyNumber table
	 * 
	 */

	@RequestMapping(value = "/App/getTop", method = RequestMethod.GET)
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:4200")

	public MyNumber getTop() {
		
		MyNumber number = numberService.findTop().get();
		

		return number;
	}

}
