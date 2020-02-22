package com.mycompany.calcapp.services;

import java.util.List;

import com.mycompany.calcapp.domain.MathOperation;
/**
 * 
 * @author Lawrence Nkafu
 * abstract methods are :
 * add(MathOperation m)
 * subtract(MathOperation m)
 * viewDatabase()
 *
 */
public interface CalculatorServices {
	public MathOperation add(MathOperation obj);
	public MathOperation subtract(MathOperation obj);
	public List<MathOperation> viewDatabase();

}
