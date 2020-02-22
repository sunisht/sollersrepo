package com.software.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mindtree.domain.Addition;

@RunWith(SpringRunner.class)
@SpringBootTest 
public class CalcTest {

	@Autowired
	Addition addition;
	
	
	@Test
	public void additionTest() {
		addition.setFirstNumber(5L);
		addition.setSecondNumber(2L);
		addition.setSum();
		assertEquals((Long)7L,(Long)addition.getSum());
	}
	
	
}
