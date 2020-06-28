package exceptionHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NoSuchElementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ranjith\\Downloads\\A_Selenium Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://learn.letskodeit.com");
		
		// 1. Timing issue
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div/div/ul/li[3]/a")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_name")));
		username.sendKeys("Ranjith");

	}

}
