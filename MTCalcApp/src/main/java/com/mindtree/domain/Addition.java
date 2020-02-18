package com.mindtree.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Addition {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	@Column(name="augend")
	Integer augend;
	@Column(name="addend")
	Integer addend;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAugend() {
		return augend;
	}
	public void setAugend(Integer augend) {
		this.augend = augend;
	}
	public Integer getAddend() {
		return addend;
	}
	public void setAddend(Integer addend) {
		this.addend = addend;
	}
	
	public Addition(Integer id, Integer augend, Integer addend) {
		super();
		this.id = id;
		this.augend = augend;
		this.addend = addend;
	}
	
	

}
