package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Naveen Automation labs Tutorials\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		
		WebElement element=driver.findElement(By.xpath("//input[@title=\"Search\"]"));
		element.sendKeys("Hello world");
		System.out.println(element.getAttribute("value"));
		
		
		Actions actions = new Actions(driver);
		WebElement element1=driver.findElement(By.xpath("//input[@value=\"Google Search\"]"));
		actions.doubleClick(element1).perform(); // Action to perform Double Click
		

	}

}
