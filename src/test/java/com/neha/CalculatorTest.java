package com.neha;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	/*@Test
	public void testAdd() {
		Calculator cu = new Calculator();
		int actual = cu.add(3, 4);
		assertEquals(7, actual);
		
	}*/
	
	@Test
	public void testAdd() {
		Calculator cu = new Calculator();
		int actual = cu.add(-2, -3);
		assertEquals(-5, actual);
		
	}
	
	/*@Test
	public void testSub(){
		Calculator cu = new Calculator();
		int actual = cu.sub(5, 4);
		assertEquals(1, actual);
	}*/
	
	@Test
	public void testSub(){
		Calculator cu = new Calculator();
		int actual = cu.sub(5, 10);
		assertEquals(-5, actual);
	}
	
	/*@Test
	public void testMul() {
		Calculator cu = new Calculator();
		int actual = cu.mul(3, 4);
		assertEquals(12, actual);
	}*/
	
	@Test
	public void testMul() {
		Calculator cu = new Calculator();
		int actual = cu.mul(0, 100);
		assertEquals(0, actual);
	}
	
	/*@Test
	public void testDivide() {
		Calculator cu = new Calculator();
		int actual = cu.divide(30, 3);
		assertEquals(10, actual);
	}*/
	
	/*@Test
	public void testDivide() {
		Calculator cu = new Calculator();
		float actual = cu.divide(9, 2);
		assertEquals(4.5F, actual);
	}*/
	
	@Test
	public void testDivide() {
		Calculator cu = new Calculator();
		float actual = cu.divide(2, 9);
		assertEquals(0.22F, actual, 0.22);
	}
}
