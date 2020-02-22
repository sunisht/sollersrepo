package com.mycompany.calcapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author Lawrence Nkafu
 * Entity class which creates database table
 * contains varibales number1, number2 and result
 * Connects to mySQL database
 *
 */
@Entity
@Table(name = "MathOperations")
public class MathOperation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	Integer id;
	@Column
	private double number1;
	@Column
	private double number2;
	@Column
	private double result;
	
	
	@Column
	private String operation;
	
	
	/**
	 * default constructor
	 */
	public MathOperation() {
		
	}
	
	/**
	 * constructor
	 * @param d
	 * @param e
	 */
	public MathOperation(double d, double e) {
		number1 = d;
		number2 = e;
	}
	/**
	 * returns variable number1 of MathOperation class
	 * @return number1
	 */
	public double getNumber1() {
		return number1;
	}
	/**
	 *  sets variable number1 of MathOperation class
	 * @param number1
	 */
	public void setNumber1(double number1) {
		this.number1 = number1;
	}
	/**
	 *  returns variable number2 of MathOperation class
	 * @return number2
	 */
	public double getNumber2() {
		return number2;
	}
	/**
	 *  sets variable number2 of MathOperation class
	 * @param number2
	 */
	public void setNumber2(double number2) {
		this.number2 = number2;
	}
	/**
	 *  returns id of the class. Id is generated automatically
	 * @return
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * sets id
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 *  returns variable result of MathOperation class
	 * @return result
	 */
	public double getResult() {
		return result;
	}
	/**
	 *  sets result of MathOperation class
	 * @param result
	 */
	public void setResult(double result) {
		this.result = result;
	}
	/**
	 *  returns operator number1 of MathOperation class
	 *  Examples of operators include +, -
	 * @return
	 */
	public String getOperation() {
		return operation;
	}
	/**
	 *  sets operator of MathOperation class
	 * @param operation
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	

}
