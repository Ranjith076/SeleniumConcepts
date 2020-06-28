package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xls_Reader reader = new Xls_Reader("F:\\Naveen Automation labs Tutorials\\Selenium Tutorial\\Data driven using excel\\DataDrivenTest.xlsx");
		
		// getCellData("SheetName","ColumnName",rowNo);
		
		String fname=reader.getCellData("RegTestData", "fname", 2);
		
		System.out.println(fname);
		
		String lname=reader.getCellData("RegTestData", "lname", 2);
		System.out.println(lname);
		
		String usrname=reader.getCellData("RegTestData", "usrname", 2);
		System.out.println(usrname);
		
		String passwrd=reader.getCellData("RegTestData", "passwrd", 2);
		System.out.println(passwrd);
		
		String confirm=reader.getCellData("RegTestData", "confirm", 2);
		System.out.println(confirm);
		
		// Webdrivercode
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\Ranjith\\Downloads\\A_Selenium Installation\\chromedriver_win32\\chromedriver.exe"
		  ); WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize(); driver.get(
		  "https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fe-11-15a225e8227c259cb820b972cb86685a-3b8877cadcbc13f02957cc39b9bd68bfc37bf5e7&flowName=GlifWebSignIn&flowEntry=SignUp"
		  );
		  
		  driver.findElement(By.id("firstName")).sendKeys(fname);
		  driver.findElement(By.id("lastName")).sendKeys(lname);
		  driver.findElement(By.id("username")).sendKeys(usrname);
		  driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys(passwrd);
		  driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys(confirm);
		  
		  
		  
		 

	}

}
