package com.mindtree.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subtraction {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	@Column(name="firstNumber")
	Long firstNumber;
	@Column(name="secondNumber")
	Long secondNumber;
	@Column(name="difference")
	Long difference;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(Long firstNumber) {
		this.firstNumber = firstNumber;
	}
	public Long getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(Long secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public Long setDifference() {
		this.difference = this.firstNumber- this.secondNumber;
		return difference;
	}
		
	public Long getDifference() {
		return difference;
	}

	public Subtraction() {
		
	}
	public Subtraction(Long id, Long firstNumber, Long secondNumber) {
		super();
		this.id = id;
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.difference = firstNumber-secondNumber;
	}
}
