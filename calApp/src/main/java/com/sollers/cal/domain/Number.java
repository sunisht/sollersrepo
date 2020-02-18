package com.sollers.cal.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Number {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	Integer firstNumber;
	Integer secondNumber;
	Integer result;
	
	public Number( Integer firstNumber, Integer secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	public Integer getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(Integer firstNumber) {
		this.firstNumber = firstNumber;
	}
	public Integer getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(Integer secondNumber) {
		this.secondNumber = secondNumber;
	}
	public Integer getResult() {
		return result;
	}
	public void setResult(Integer result) {
		this.result = result;
	}
	
	

}
