package com.mindtree.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class AppwideExceptionHandler {

	@ExceptionHandler(IncorrectInputException.class)
	@ResponseBody
	@ResponseStatus(value= HttpStatus.BAD_REQUEST,reason="INCORRECT_INPUT!!")
	public String inputsNotFoundException() {
		return ("Please enter valid input");
	}
	
}
