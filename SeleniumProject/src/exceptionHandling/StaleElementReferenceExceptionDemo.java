package exceptionHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ranjith\\Downloads\\A_Selenium Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.pavantestingtools.com/");
		
		WebElement link = driver.findElement(By.xpath("//*[@id=\"site-navigationpbt\"]/div/ul/li[12]/a"));
		
		link.click();
		
		driver.navigate().back(); // causes the element to stale
		
		try
		{
			link.click(); // this line causing stale element reference exception
		}
		
		catch (StaleElementReferenceException e) {
			
			link = driver.findElement(By.xpath("//*[@id=\"site-navigationpbt\"]/div/ul/li[12]/a"));
			
			link.click();
		}
		
		

	}

}
