package exceptionHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ranjith\\Downloads\\A_Selenium Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");
		
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("abcd");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("efgh");
		
		driver.navigate().refresh(); // causes the element to stale
		
		try {
			
		username.sendKeys("abcd"); // line causing exception
		
		}
		catch(StaleElementReferenceException e) {
			
			username = driver.findElement(By.name("email"));
			username.sendKeys("abcd");
			
		}

	}

}
