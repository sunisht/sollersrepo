package com.mindtree.project.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.mindtree.project.domain.Calculation;
import com.mindtree.project.persistance.CalculationRepository;
import com.mindtree.project.service.impl.CalculationServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CalculationServiceImplTest{
	
	@Mock
	private CalculationRepository calculationRepository;
	@InjectMocks
	private CalculationServiceImpl calculationService;
	
	@Test
	public void addTest() {
		
		Calculation calc = mock(Calculation.class);
		when(calculationRepository.save(any())).thenReturn(calc);
		
		int result = calculationService.addition(5, 2);
		assertEquals(7, result);
	}
	
	@Test
	public void substractTest() {
		
		Calculation calc = mock(Calculation.class);
		when(calculationRepository.save(any())).thenReturn(calc);
		
		int result = calculationService.subtraction(5, 2);
		assertEquals(3, result);
	}
}
