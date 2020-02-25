package com.software.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.mindtree.persistence.AdditionRepository;
import com.mindtree.service.AdditionService;
import com.mindtree.service.impl.AdditionServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class CalcServiceTest {
	
	@Mock
	AdditionRepository additionRepository;
	
	@Mock
	AdditionService additionService;
	
	@Mock
	AdditionServiceImpl additionServiceImpl;
	
	@Test
	public void testAddRequest() {
		
	}

}
