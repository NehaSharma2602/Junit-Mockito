package com.neha;

public class JunitLifeCycle {

	public String beforeEach() {
		return "runs before every @Test method";
	}
	
	public String beforeAll() {
		return "runs only once before all tests.";
	}
	
	public String afterEach() {
		return "runs after every test.";
	}
	
	public String afterAll() {
		return "Runs once after all tests finish";
	}
}
