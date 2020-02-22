package com.sollers.calcapp.controller;

import com.sollers.calcapp.domain.Addition;
import com.sollers.calcapp.domain.Subtraction;
import com.sollers.calcapp.service.impl.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@CrossOrigin(origins="*",allowedHeaders="*")
public class CalController {
	@Autowired
	ICalculatorService services;

	@PostMapping(value = "/Addition/{id}")
	@ResponseBody
	public ResponseEntity<Addition> add(@RequestBody Addition arithmeticObject) {
		ResponseEntity<Addition> obj = services.add(arithmeticObject);
		return new ResponseEntity<Addition>(HttpStatus.OK);
	}


	@PostMapping(value = "/Subtraction/{id}")
	@ResponseBody
	public ResponseEntity<Subtraction> Subtract(@RequestBody Subtraction mathObject) {
		return null;
	}


}
