package com.TestNGBasicAnnotations;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	//invocationCount used to execute test cases multiple times
	//invocationCount = -1 or 0 leads to following error: "No tests found. Nothing was run"
	
	@Test(invocationCount=2)
	public void sum() {
		System.out.println("Test sum");
	}
	
	@Test(enabled= false)
	public void sum1() {
		
		int i = 1/0;
		System.out.println("Test sum");
	}

}
