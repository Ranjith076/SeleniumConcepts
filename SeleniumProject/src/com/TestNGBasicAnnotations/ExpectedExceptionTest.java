package com.TestNGBasicAnnotations;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {
	
	// expectedExceptions: Execution of test cases even the exception is encountered.
	
	@Test(expectedExceptions=ArrayIndexOutOfBoundsException.class)
	public void ArrayException() {
		
		int i[]=new int[4];
		System.out.println(i[5]);
		
	}
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void NumberFormatException() {
		
		String str="100A";
		Integer.parseInt(str);
	}
	
	
	
	
	
}
