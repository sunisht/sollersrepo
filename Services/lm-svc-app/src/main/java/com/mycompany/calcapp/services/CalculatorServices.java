package com.mycompany.calcapp.services;

import java.util.List;

import com.mycompany.calcapp.domain.MathOperation;

public interface CalculatorServices {
	public MathOperation add(MathOperation obj);
	public MathOperation substract(MathOperation obj);
	public List<MathOperation> ViewDataBase();

}
