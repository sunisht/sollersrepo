package com.mycompany.calcapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.calcapp.domain.MathOperation;
import com.mycompany.calcapp.exception.CustomError;
import com.mycompany.calcapp.services.CalculatorServices;
/**
 * 
 * @author Lawrence Nkafu
 * Controller class
 * contains mapping to addition, subtraction endpoints
 *
 */
@Controller
@CrossOrigin(origins="*",allowedHeaders="*")
public class CalController {
	@Autowired
	CalculatorServices services;
	
	/**
	 * Returns a lists all operations performed which are stored in the database.
	 * Makes use of a service class to retrieve from database 
	 * @return ResponseEntity
	 */
	@ResponseBody
	@RequestMapping(value = "/Operations", method = RequestMethod.GET)
	public ResponseEntity<?> readAll() {
		List<MathOperation> list = services.viewDatabase();
		if (list.isEmpty()) {
			CustomError error = new CustomError(100," Database is empty");
			new ResponseEntity<CustomError>(error,HttpStatus.NOT_FOUND);
		}
		return  new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	/**
	 * End point to perform addition. Makes use of a service class to perform the said functionality
	 * @param mathObject
	 * @return
	 */
	@RequestMapping(value = "/Addition", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> add(@RequestBody MathOperation mathObject) {
		
		if (mathObject == null) {
			CustomError error = new CustomError(100," Error performing addition operaiton. No "
					+ "data was stored in the Database");
			new ResponseEntity<CustomError>(error,HttpStatus.NOT_FOUND);
		}
		MathOperation obj = services.add(mathObject);
		return  new ResponseEntity<>(obj,HttpStatus.OK);
	}
	
	/**
	 * Endpoint to perform subtraction. makes use of a service method to perform the said operation
	 * @param mathObject
	 * @return
	 */
	@RequestMapping(value = "/Subtraction", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> subtract(@RequestBody MathOperation mathObject) {
		if (mathObject == null) {
			CustomError error = new CustomError(100," Error performing addition operaiton. No "
					+ "data was stored in the Database");
			new ResponseEntity<CustomError>(error,HttpStatus.NOT_FOUND);
		}
		MathOperation obj = services.subtract(mathObject);
		return  new ResponseEntity<>(obj,HttpStatus.OK);
	}


}
