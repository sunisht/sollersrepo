package com.sollers.app.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sollers.app.vo.AppJson;
import com.sollers.app.vo.AppResponse;

@Controller
@RequestMapping("/calcController")
public class CalcController {

	/*
	 * Option 1
	 */
	@PostMapping(value = "/getData")
	public @ResponseBody AppJson<AppResponse> getCsrf(HttpServletRequest request, HttpServletResponse response,
			@RequestBody final AppJson<Map<String, Object>> appJsonRequest) {
		
		return null;
	}
	
	/*
	 * Option 2
	 */
	@PostMapping(value = "/home")
	public Object home() {
		AppJson<AppResponse> appJsonResponse = new AppJson<>();
		
		return null;
	}
	
	/*
	 * Option 2
	 */
	@PostMapping(value = "/add")
	public Object add(@RequestParam("firstNumber") int firstNumber, @RequestParam("secondNumber") int secondNumber) {
		return null;
	}
	
	/*
	 * Option 2
	 */
	@PostMapping(value = "/subtract")
	public Object subtract(@RequestParam("firstNumber") int firstNumber, @RequestParam("secondNumber") int secondNumber) {
		return null;
	}
}
