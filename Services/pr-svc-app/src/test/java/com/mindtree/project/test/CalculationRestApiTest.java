package com.mindtree.project.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.mindtree.project.controller.HomeController;
import com.mindtree.project.service.CalculationService;

@ExtendWith(MockitoExtension.class)
public class CalculationRestApiTest {

	@Mock
	private CalculationService calculationService;

	@InjectMocks
	private HomeController calculationRest;

	@Test
	public void addTest() {

		when(calculationService.addition(anyInt(), anyInt())).thenReturn(7);
		int result = calculationRest.addition("5", "2");
		assertEquals(7, result);
	}

	@Test
	public void substractTest() {

		when(calculationService.subtraction(anyInt(), anyInt())).thenReturn(3);
        int result = calculationRest.subtraction("5", "2");
		assertEquals(3, result);
	}
}
