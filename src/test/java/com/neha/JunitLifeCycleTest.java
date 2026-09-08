package com.neha;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JunitLifeCycleTest {

	private JunitLifeCycle lifecycle;
	
	@BeforeEach
	public void setUpBeforeEach() {
		lifecycle = new JunitLifeCycle();
	}
	
	/*@BeforeAll
	public void setUpBeforeAll() {
		lifecycle = new JunitLifeCycle();
	}*/
	
	@AfterEach
	public void setUpAfterEach() {
		lifecycle = new JunitLifeCycle();
	}
	
	/*@AfterAll
	public void setUpAfterAll() {
		lifecycle = new JunitLifeCycle();
	}*/
	
	@Test
    public void testBeforeEachMethod() {
        String actual = lifecycle.beforeEach();

        assertEquals("runs before every @Test method", actual);
    }
	
	@Test
	public void testBeforeAllMethod() {
		String actual = lifecycle.beforeAll();
		
		assertEquals("runs only once before all tests.", actual);
	}
	
	@Test
	public void testAfterAllMethod() {
		String actual = lifecycle.afterAll();
		
		assertEquals("Runs once after all tests finish", actual);
	}
	
	@Test
	public void testAfterEachMethod() {
		String actual = lifecycle.afterEach();
		
		assertEquals("runs after every test.", actual);
	}

}
