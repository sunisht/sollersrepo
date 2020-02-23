package com.calculator.calculator;

import static org.junit.jupiter.api.Assertions.fail;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.sollers.calcapp.controller.MathController;
import com.sollers.calcapp.domain.Calculator;
import com.sollers.calcapp.persistence.CalculatorRepository;




@RunWith(SpringRunner.class)
@DataJpaTest
class CalculatorRepositoryTest {

	@InjectMocks
	private MathController mathController;

	@Mock
	private CalculatorRepository calculatorRepository;

	@Before(value = "")
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		c.setResult(11);
		when(calculatorRepository.add(11)).thenReturn(c);
		
		Math math = mathController.add(11);
		
		verify(calculatorRepository).add(11);
		
		assertEquals(11,math.add().intValue());

		
		@Test
		public void testSubtract() {
			Calculator c = new Calculator();
			c.setResult(11);
			when(calculatorRepository.subtract(11)).thenReturn(c);
			
			Math math = mathController.subtract(11);
			
			verify(calculatorRepository).subtract(11);
			
			assertEquals(11,math.subtract().intValue());

	}
}
