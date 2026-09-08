package com.neha;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JunitLifeCycleTest2 {
	    @BeforeAll
	    public static void beforeAll() {
	        System.out.println("1. Before All - Runs only once before all tests");
	    }

	    @BeforeEach
	    public void beforeEach() {
	        System.out.println("2. Before Each - Runs before every test");
	    }

	    @Test
	    public void testAddition() {
	        System.out.println("3. Test Addition is running");
	    }

	    @Test
	    public void testMultiplication() {
	        System.out.println("3. Test Multiplication is running");
	    }

	    @AfterEach
	    public void afterEach() {
	        System.out.println("4. After Each - Runs after every test");
	    }

	    @AfterAll
	    public static void afterAll() {
	        System.out.println("5. After All - Runs only once after all tests");
	    }
}
