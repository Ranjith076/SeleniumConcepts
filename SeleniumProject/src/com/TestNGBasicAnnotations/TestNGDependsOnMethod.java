package com.TestNGBasicAnnotations;

import org.testng.annotations.Test;

public class TestNGDependsOnMethod {
	
	// Depends on Execution
	
	@Test
	public void loginTest() {
		System.out.println("Login Test");
		int i=2/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void HomePage() {
		System.out.println("Home page test");
	}
	
	@Test(dependsOnMethods="HomePage")
	public void Regpage() {
		System.out.println("Reg page test");
	}

}
