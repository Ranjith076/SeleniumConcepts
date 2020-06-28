package com.TestNGBasicAnnotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
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
	
	@Test(priority=1, groups="Google page test")
	public void GetPageTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=3, groups="Google page test")
	public void GoogleLogoTest() {
		driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
	}
	
	@Test(priority=2, groups="Google page test")
	public void linkTest() {
		driver.findElement(By.linkText("Mail")).isDisplayed();
	}
	
	@Test(priority=4, groups="Test")
	public void test1() {
		System.out.println("test 1");
	}
	
	@Test(priority=5, groups="Test")
	public void test2() {
		System.out.println("test 2");
	}
	
	@Test(priority=6, groups="Test")
	public void test3() {
		System.out.println("test 3");
	}
	
	@AfterMethod
	public void TearDown() {
		
		driver.quit();
	}
	

}
