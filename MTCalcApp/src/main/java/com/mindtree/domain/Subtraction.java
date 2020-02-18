package com.mindtree.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subtraction {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	@Column(name="minuend")
	Integer minuend;
	@Column(name="subtrahend")
	Integer subtrahend;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMinuend() {
		return minuend;
	}
	public void setMinuend(Integer minuend) {
		this.minuend = minuend;
	}
	public Integer getSubtrahend() {
		return subtrahend;
	}
	public void setSubtrahend(Integer subtrahend) {
		this.subtrahend = subtrahend;
	}
	
	public Subtraction(Integer id, Integer minuend, Integer subtrahend) {
		super();
		this.id = id;
		this.minuend = minuend;
		this.subtrahend = subtrahend;
	}
	
	

}
