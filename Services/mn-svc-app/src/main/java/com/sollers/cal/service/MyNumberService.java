package com.sollers.cal.service;

import java.util.List;
import java.util.Optional;

import org.json.JSONObject;

import com.sollers.cal.domain.MyNumber;

public interface MyNumberService {
	/**
	 * 
	 * Author:Minh Nguyen
	 * Purpose: Create new a new  records in MyNumber table
	 * @param number
	 * return MyNumber object
	 */
	public MyNumber save (MyNumber number);
	/**
	 * Author:Minh Nguyen
	 * Purpose: List all records in MyNumber table
	 */
	
	public List<MyNumber> findAll();
	/**
	 * Author:Minh Nguyen
	 * Purpose: get the latest records, that have been save into table
	 */
	
	public Optional<MyNumber> findTop();
	/**
	 * Author: Minh Nguyen
	 * Purpose: sum a and b and return sum
	 * @param a
	 * @param b
	 * @return a+b
	 */
	public Double add(Double firstNumber,Double secondNumber);
	/**
	 * Author:Minh Nguyen
	 * Purpose: subtract a and b return result
	 * @param a
	 * @param b
	 * @return a-b
	 */
	public Double subtraction(Double a,Double b);
	/**
	 * Author:Minh Nguyen
	 * Purpose: convert to an json object
	 * @param firstNumber
	 * @param secondNumber
	 * @param result
	 * @return json object
	 */
	public JSONObject converToJson(Double firstNumber,Double secondNumber, Double result,String sign);

}
