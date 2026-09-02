package com.neha;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeEachCalculatorTest {

	private Calculator calcu;
	
	@BeforeEach
	public void setup() {
		calcu = new Calculator();
	}
	
	
	@Test
	public void testAdd() {
		int actual = calcu.add(-2, -3);
		assertEquals(-5, actual);
		
	}
	
	
	@Test
	public void testSub(){
		int actual = calcu.sub(5, 10);
		assertEquals(-5, actual);
	}
	
	
	@Test
	public void testMul() {
		int actual = calcu.mul(0, 100);
		assertEquals(0, actual);
	}
	
	
	
	@Test
	public void testDivide() {
		float actual = calcu.divide(9, 2);
		assertEquals(4.5F, actual);
	}
	
	
}
