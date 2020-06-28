package javaScriptExecutors;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BorderingElement {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ranjith\\Downloads\\A_Selenium Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");
		
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ranjith.sit.cs@gmail.com");
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("R@njith0766");
		
		WebElement usrName = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement passWord = driver.findElement(By.xpath("//input[@name='password']"));
		
		sendKeys(usrName, driver, "ranjith.sit.cs@gmail.com");
		sendKeys(passWord, driver, "R@njith0766");
		
		WebElement loginBtn = driver.findElement(By.xpath("//div[contains(@class,'ui fluid large blue submit button')]"));
		
		drawBorder(loginBtn,driver); // Function to draw a border
		
		// To take screenshot
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("D:\\DrawBorderTest.png"));
		
		// to generate alert
		generateAlert(driver,"Bug in a Login page");
		
		Thread.sleep(3000);
		Alert alert =driver.switchTo().alert();
		alert.accept();
		
		clickElementByJS(loginBtn,driver);
		refreshBrowserByJS(driver);
		System.out.println(getTitleByJS(driver));
		System.out.println(getPageInnerText(driver));
		
	}
	
	public static void sendKeys(WebElement element,WebDriver driver, String value ) {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='"+ value +"';", element);
		
	}
	
	public static void drawBorder(WebElement element,WebDriver driver ) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		
	}
	
	public static void generateAlert(WebDriver driver, String msg) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alert('"+msg+"')");
		
	}
	
	public static void clickElementByJS(WebElement element,WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
		
	}
	
	public static void refreshBrowserByJS(WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}
	
	public static String getTitleByJS(WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String title = js.executeScript("return document.title").toString();
		return title;
	}
	
	public static String getPageInnerText(WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String pageText = js.executeScript("return document.documentElement.innnerText;").toString();
		return pageText;
	}
	

}
