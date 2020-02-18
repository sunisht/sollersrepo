package com.mindtree.project.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Substraction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numberOne;
	private Integer numberTwo;

	public Integer getNumberOne() {
		return numberOne;
	}

	public void setNumberOne(Integer numberOne) {
		this.numberOne = numberOne;
	}

	public Integer getNumberTwo() {
		return numberTwo;
	}

	public void setNumberTwo(Integer numberTwo) {
		this.numberTwo = numberTwo;
	}
}
