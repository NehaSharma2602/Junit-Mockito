package com.neha;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AssertionsTest {

	private Assertions asser;
	
	@BeforeEach
	public void setUp() {
		asser = new Assertions(); 
	}
	
	@Test
	public void testIsEven() {
		assertTrue(asser.isEven(4));
	}
	
	@Test
	public void testIsOdd() {
		assertFalse(asser.isEven(7));
	}
	
	@Test
	public void testGetMessage() {
		assertNotNull(asser.getMessage());
	}
	
	@Test
	public void testGetName() {
		assertNull(asser.getName());
	}
}
