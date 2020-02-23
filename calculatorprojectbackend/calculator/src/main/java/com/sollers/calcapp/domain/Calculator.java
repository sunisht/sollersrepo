package com.sollers.calcapp.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Calculator")
public class Calculator {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;

	
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

	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	



}
