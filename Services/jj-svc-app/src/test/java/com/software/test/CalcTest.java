package com.software.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mindtree.MindTreeUseCaseApplication;
import com.mindtree.domain.Addition;
import com.mindtree.domain.Subtraction;
import com.mindtree.persistence.AdditionRepository;
import com.mindtree.service.AdditionService;
import com.mindtree.service.impl.AdditionServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=MindTreeUseCaseApplication.class)
public class CalcTest {
	
	@Test
	public void testAddition() {
		assertEquals((Long)7L, (Long)(new Addition(5L, 2L)).getSum());
		assertEquals((Long)(-1L), (Long)(new Addition(3L, -4L).getSum()));
		assertEquals((Long)8L, (Long)(new Addition(8L, 3L)).getFirstNumber());
		assertEquals((Long)3L, (Long)(new Addition(8L, 3L)).getSecondNumber());
	}
	
	@Test
	public void testSubtraction() {
		assertEquals((Long)3L, (Long)(new Subtraction(5L, 2L)).getDifference());
		assertEquals((Long)(-1L), (Long)(new Subtraction(3L, 4L).getDifference()));
		assertEquals((Long)6L,(Long)(new Subtraction(6L, 2L)).getFirstNumber());
		assertEquals((Long)1L, (Long)(new Subtraction(3L, 1L)).getSecondNumber());
	}

}
