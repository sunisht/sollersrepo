package com.sollers.cal.service;

import java.util.List;

import com.sollers.cal.domain.MyNumber;

public interface MyNumberService {
	/*
	 * Create a new combination of  firstNumber, lastNumber
	 */
	public MyNumber save (MyNumber number);
	/**
	 * Method add to add the number by latest id.
	 * whenever user Add submit button. 
	 * System creates new id for number. This is the latest id
	 * And return the result. 
	 * @param id
	 * @return  Number.firstNumber + Number.secondNumber
	 */
	public Integer  add(Integer id);
	/**
	 * Method add to add the number by latest id.
	 * whenever user Add submit button. 
	 * System creates new id for number. This is the latest id
	 * And return the result. /	 * @param id
	 * @return Number.firstNumber -Number.secondNumber
	 */
	public Integer  subtract(Integer id);
	
	public List<MyNumber> findAll();

}
