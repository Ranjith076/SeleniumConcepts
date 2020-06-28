package com.TestNGBasicAnnotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AssertionTest {
	

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ranjith\\Downloads\\A_Selenium Installation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		
	}
	
	@Test
	public void GetPageTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Amazon", title);
	}

	@AfterMethod
	public void TearDown() {
		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	

}
