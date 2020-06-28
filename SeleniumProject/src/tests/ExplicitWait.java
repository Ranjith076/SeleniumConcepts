package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ranjith\\Downloads\\A_Selenium Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=http%3A%2F%2Fsupport.google.com%2Fmail%2Fanswer%2F56256%3Fhl%3Den&hl=en&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement firstname = driver.findElement(By.id("firstName"));
		WebElement buttonClick = driver.findElement(By.id("yDmH0d"));
		
		sendkeys(driver, firstname, 20, "Ranjith");
		btnClick(driver, buttonClick, 20);
		
		driver.quit();

	}
	
	public static void sendkeys(WebDriver driver, WebElement element, int timeout, String value ) {
		
		WebDriverWait explicitWait =new WebDriverWait(driver, timeout);
		explicitWait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

	public static void btnClick(WebDriver driver, WebElement element, int TimeOut) {
		
		new WebDriverWait(driver, TimeOut).
		until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}

}
