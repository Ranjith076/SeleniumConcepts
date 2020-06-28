package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ranjith\\Downloads\\A_Selenium Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");
		
		driver.findElement(By.name("email")).sendKeys("ranjith.sit.cs@gmail.com");
		driver.findElement(By.name("password")).sendKeys("R@njith076");
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();
		
		//td[text()='Ranjith C']//preceding-sibling::td//input[@name='id']
		driver.findElement(By.xpath("//td[text()='Ranjith C']//preceding-sibling::td//label")).click();

	}

}
