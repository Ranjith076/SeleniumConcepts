package tests;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupIterations {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ranjith\\Downloads\\A_Selenium Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
		
		Thread.sleep(2000);
		
		Set<String> handle=driver.getWindowHandles();
		
		Iterator<String> it = handle.iterator();
		
		while(it.hasNext()) {
			
			driver.switchTo().window(it.next());
			String title=driver.getTitle();
			System.out.println(title);
			
			//Assert.assertEquals("PopupTest Tuesday February, 11 2020", title);
		}

	}

}
