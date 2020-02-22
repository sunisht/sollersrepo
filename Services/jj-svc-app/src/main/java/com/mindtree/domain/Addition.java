package com.mindtree.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Addition {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	@Column(name="firstNumber")
	Long firstNumber;
	@Column(name="secondNumber")
	Long secondNumber;
	@Column(name="sum")
	Long sum;
	
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
	public Long getSum() {
		return sum;
	}
	public Long setSum() {
		this.sum = this.firstNumber+this.secondNumber;
		return sum;
	}
	
	@Autowired
	public Addition() {
		
	}
	public Addition(Long id, Long firstNumber, Long secondNumber) {
		super();
		this.id = id;
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.sum = firstNumber + secondNumber;
	}
	
	

}
