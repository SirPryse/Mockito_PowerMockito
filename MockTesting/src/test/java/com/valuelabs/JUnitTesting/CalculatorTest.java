package com.valuelabs.JUnitTesting;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void usingMockito() {
		CalculatorInterface hello = mock(Calculator.class);
		when(hello.addcalc(5,10)).thenReturn(15);
		assertEquals(15,hello.addcalc(5, 10));
	}
	
	@Test(expected=RuntimeException.class)
	public void usingMockito2() {
		CalculatorInterface hello = mock(Calculator.class);
		when(hello.dividecalc(0,0)).thenThrow(new RuntimeException("Divided by 0"));
		hello.dividecalc(0,0);
	}

}
