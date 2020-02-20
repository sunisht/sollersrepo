package com.mindtree.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST,reason="Incorrect Inputs")
public class IncorrectInputException extends RuntimeException {

}
