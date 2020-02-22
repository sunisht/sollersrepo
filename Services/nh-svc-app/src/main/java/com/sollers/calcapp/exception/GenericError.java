package com.sollers.calcapp.exception;

public class GenericError {
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
	public GenericError(Integer code, String description) {
		super();
		this.code = code;
		this.description = description;
	}
	
}
