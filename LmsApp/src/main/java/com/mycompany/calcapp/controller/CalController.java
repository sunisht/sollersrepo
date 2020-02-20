package com.mycompany.calcapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.calcapp.Exception.CustomError;
import com.mycompany.calcapp.domain.MathOperation;
import com.mycompany.calcapp.services.CalculatorServices;

@Controller
public class CalController {
	@Autowired
	CalculatorServices services;
	
	@ResponseBody
	@RequestMapping(value = "/Operations", method = RequestMethod.GET)
	public ResponseEntity<?> readAll() {
		List<MathOperation> list = services.ViewDataBase();
		if (list.isEmpty()) {
			CustomError error = new CustomError(100," Database is empty");
			new ResponseEntity<CustomError>(error,HttpStatus.NOT_FOUND);
		}
		return  new ResponseEntity<List<MathOperation>>(list,HttpStatus.OK);
	}
	@RequestMapping(value = "/Addition", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> add(@RequestBody MathOperation mathObject) {
		
		if (mathObject == null) {
			CustomError error = new CustomError(100," Error performing addition operaiton. No "
					+ "data was stored in the Database");
			new ResponseEntity<CustomError>(error,HttpStatus.NOT_FOUND);
		}
		MathOperation obj = services.add(mathObject);
		return  new ResponseEntity<MathOperation>(obj,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/Substraction", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> Substract(@RequestBody MathOperation mathObject) {
		if (mathObject == null) {
			CustomError error = new CustomError(100," Error performing addition operaiton. No "
					+ "data was stored in the Database");
			new ResponseEntity<CustomError>(error,HttpStatus.NOT_FOUND);
		}
		MathOperation obj = services.substract(mathObject);
		return  new ResponseEntity<MathOperation>(obj,HttpStatus.OK);
	}


}
