package com.mycompany.calcapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.calcapp.domain.MathOperation;
import com.mycompany.calcapp.exception.CustomError;
import com.mycompany.calcapp.services.CalculatorServices;
/**
 * Controller class
 * contains mapping to addition, subtraction endpoints
 * @author Lawrence Nkafu.
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
	@GetMapping(value = "/Operations")
	public ResponseEntity<Object> readAll() {
		List<MathOperation> list = services.viewDatabase();
		return  new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	/**
	 * End point to perform addition. Makes use of a service class to perform the said functionality
	 * @param mathObject
	 * @return
	 */
	@PostMapping(value = "/Addition")
	@ResponseBody
	public ResponseEntity<Object> add(@RequestBody MathOperation mathObject) {
		
		if (mathObject == null) {
			CustomError error = new CustomError(100," Error performing addition operaiton. No "
					+ "data was stored in the Database");
			new ResponseEntity<CustomError>(error,HttpStatus.NOT_FOUND);
		}
		MathOperation obj = services.add(mathObject);
		return  new ResponseEntity<>(obj,HttpStatus.CREATED);
	}
	
	/**
	 * Endpoint to perform subtraction. makes use of a service method to perform the said operation
	 * @param mathObject
	 * @return
	 */

	@PostMapping(value = "/Subtraction")
	@ResponseBody
	public ResponseEntity<Object> subtract(@RequestBody MathOperation mathObject) {
		if (mathObject == null) {
			CustomError error = new CustomError(100," Error performing addition operaiton. No "
					+ "data was stored in the Database");
			new ResponseEntity<CustomError>(error,HttpStatus.NOT_FOUND);
		}
		MathOperation obj = services.subtract(mathObject);
		return  new ResponseEntity<>(obj,HttpStatus.CREATED);
	}


}
