package com.mycompany.calcapp.exception;

public class CustomError {
	Integer code;
	String description;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public CustomError() {}
	
	public CustomError(Integer code, String description) {
		super();
		this.code = code;
		this.description = description;
	}
	
}
