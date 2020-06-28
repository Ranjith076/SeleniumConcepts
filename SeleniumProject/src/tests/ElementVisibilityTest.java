package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ranjith\\Downloads\\A_Selenium Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://register.freecrm.com/register/");
		
		// isDisplayed() method
		boolean b1 =driver.findElement(By.name("action")).isDisplayed();
		System.out.println(b1);
		
		
		// isEnabled() method
		boolean b2 =driver.findElement(By.name("action")).isEnabled();
		System.out.println(b2);
		
		// isSelected method
		boolean b3=driver.findElement(By.id("terms")).isSelected();
		System.out.println(b3);
		
		driver.findElement(By.id("terms")).click();
		
		boolean b4=driver.findElement(By.id("terms")).isSelected();
		System.out.println(b4);

	}

}
