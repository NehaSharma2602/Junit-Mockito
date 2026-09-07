package com.neha;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExceptionTest {
	
	private Exceptions exceptions;

	@BeforeEach
	public void setUp() {
		exceptions = new Exceptions();
	}
	@Test
	public void testDivideByZero() {
		ArithmeticException exce = assertThrows(ArithmeticException.class, () -> {
			exceptions.divide(10, 0);
		});
		
		assertEquals("cannot divide by zero", exce.getMessage());
	}
}
