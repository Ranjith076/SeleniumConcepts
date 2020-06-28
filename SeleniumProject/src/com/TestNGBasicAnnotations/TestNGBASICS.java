package com.TestNGBasicAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBASICS {
	
//	@BeforeSuite--> Set system property for chrome : 1
//	@BeforeTest--> Login to app : 2
//	@BeforeClass--> Launch Chrome Browser : 3
	
//	@BeforeMethod--> Enter URL
//	@Test--> TestCase1
//	@AfterMethod--> Logout from App
	
//	@BeforeMethod--> Enter URL
//	@Test--> TestCase2
//	@AfterMethod--> Logout from App
	
//	@BeforeMethod--> Enter URL
//	@Test--> TestCase3
//	@AfterMethod--> Logout from App
	
//	@AfterClass--> close browser : 5
//	@AfterTest--> Delete all cookies : 6
	
	
	
	// Pre-conditions starting with @Before
	@BeforeSuite
	public void setup() {
		System.out.println("@BeforeSuite--> Set system property for chrome");
	}
	
	@BeforeTest
	public void login() {
		System.out.println("@BeforeTest--> Login to app");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("@BeforeClass--> Launch Chrome Browser");
	}
	
		
	@BeforeMethod
	public void enterURL() {
		System.out.println("@BeforeMethod--> Enter URL");
	}
	
	// Test cases start with @Test
	@Test
	public void TestCase1() {
		System.out.println("@Test--> TestCase1");
	}
	
	@Test
	public void TestCase2() {
		System.out.println("@Test--> TestCase2");
	}
	
	@Test
	public void TestCase3() {
		System.out.println("@Test--> TestCase3");
	}
	
	// Post Conditions starts with @After
	@AfterMethod
	public void logout() {
		System.out.println("@AfterMethod--> Logout from App");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("@AfterClass--> close browser");
	}
	
	@AfterTest
	public void deleteallCookies() {
		System.out.println("@AfterTest--> Delete all cookies");
	}
	
		
	/*
	 * @AfterSuite public void generateReport() {
	 * System.out.println("Generate report"); }
	 */
}
