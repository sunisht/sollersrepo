package com.sollers.calcapp.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.Table;

@Entity
@Table(name="Calculator")
public class Calculator {

	
	

	
	@Column
	(name="first number")
	Integer firstNumber;

	@Column
	(name = "second number")
	Integer secondNumber;

    @Column
	Integer result;

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
