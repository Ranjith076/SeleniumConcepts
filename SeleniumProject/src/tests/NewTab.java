package tests;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ranjith\\Downloads\\A_Selenium Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://openclinic.sourceforge.net/");
		
		String SelectLinkNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.linkText("Download")).sendKeys(SelectLinkNewTab);
		
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		//To print the page title of the next tab
		System.out.println(driver.getTitle());
		
		// To close the tab window
		driver.close();
		
		// To close the parent window
		driver.switchTo().window(tabs.get(0));
		driver.close();

	}

}
