package com.sollers.calcapp.domain;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.persistence.*;

@Entity
@Table(name = "SubtractionResults")
public class Subtraction {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Integer id;

	@Column
	private double firstNum;

	@Column
	private double secondNum;

	@Column
	private double result;

	@Column
	private String arithmeticOperation;

	public Subtraction(int id, double firstNum, double secondNum, double result, String operation){
		this.id = getId();
		this.firstNum = getFirstNum();
		this.secondNum = getSecondNum();
		this.result = getResult();
		this.arithmeticOperation = getArithmeticOperation();
	}

	public Subtraction(ResponseEntity<Addition> obj, HttpStatus ok) {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(double firstNum) {
		this.firstNum = firstNum;
	}

	public double getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(double secondNum) {
		this.secondNum = secondNum;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public String getArithmeticOperation() {
		return arithmeticOperation;
	}

	public void setArithmeticOperation(String arithmeticOperation) {
		this.arithmeticOperation = arithmeticOperation;
	}
}
