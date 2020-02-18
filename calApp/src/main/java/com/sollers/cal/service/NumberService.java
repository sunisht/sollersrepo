package com.sollers.cal.service;

public interface NumberService {
	
	/*
	 * Create a new combination of  firstNumber, lastNumber
	 */
	public Number save (Number number);
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
	 * And return the result. 
	 * @param id
	 * @return Number.firstNumber -Number.secondNumber
	 */
	public Integer  subtract(Integer id);


}
