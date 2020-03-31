package com.mindtree.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mindtree.domain.Addition;
import com.mindtree.domain.Subtraction;
import com.mindtree.service.AdditionService;
import com.mindtree.service.SubtractionService;

/* Include Validation */

@Controller
@CrossOrigin(origins="*",allowedHeaders="*")
public class CalcController {
	@Autowired
	AdditionService additionService;
	@Autowired
	SubtractionService subtractionService;
	
	@ResponseBody
	@GetMapping(value = "/Addition")
	public List<Addition> getAdditions() {
		return additionService.findAll();
	}
	
	@ResponseBody
	@GetMapping(value = "/Subtraction")
	public List<Subtraction> getSubtractions() {
		return subtractionService.findAll();
	}
	
	@PostMapping(value = "/Addition")
	@ResponseBody
	public Addition add(@RequestBody Addition addition) {
		return additionService.addRequest(addition);
	}
	
	@PostMapping(value = "/Subtraction")
	@ResponseBody
	public Subtraction subtract(@RequestBody Subtraction subtraction) {
		return subtractionService.subtractRequest(subtraction);
	}
	
	@DeleteMapping(value="/Addition/Delete/{additionId}")
	@ResponseBody
	public Addition deleteAddition(@PathVariable Long additionId){
		return additionService.deleteAddition(additionId); 
	}
	
	@DeleteMapping(value="/Subtraction/Delete/{subtractionId}")
	@ResponseBody
	public Subtraction deleteSubtraction(@PathVariable Long subtractionId){
		return subtractionService.deleteSubtraction(subtractionId); 
	}
}
