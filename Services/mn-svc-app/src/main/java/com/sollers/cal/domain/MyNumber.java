package com.sollers.cal.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * Author:Minh Nguyen
 * Purpose: 
 * 		-	This class to define  MyNumber class and reflect as MyNumber table in database with primary key id
 * 			
 */
@Entity
public class MyNumber {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	Double firstNumber;
	Double secondNumber;
	Double result;
	String sign;
	
	public MyNumber()
	{
		
	}
	
	public MyNumber(Integer id, Double firstNumber, Double secondNumber, Double result) {
		super();
		this.id = id;
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.result = result;
	}

	
	public Double getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(Double firstNumber) {
		this.firstNumber = firstNumber;
	}
	public Double getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(Double secondNumber) {
		this.secondNumber = secondNumber;
	}
	public Double getResult() {
		return result;
	}
	public void setResult(Double result) {
		this.result = result;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	

}
