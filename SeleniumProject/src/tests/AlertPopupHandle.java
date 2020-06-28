package tests;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
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
		
		String ParentWindow=it.next();
		System.out.println("Parent Window id "+ ParentWindow);
		
		String ChildWindow=it.next();
		System.out.println("Child Window id "+ ChildWindow);
		
		driver.switchTo().window(ChildWindow);
		
		Thread.sleep(2000);
		System.out.println("Child window Title "+ driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(ParentWindow);
		
		Thread.sleep(2000);
		
		System.out.println("Parent window Title "+ driver.getTitle());
		
//		driver.getWindowHandle();
//		System.out.println(driver.getTitle());
		
		

	}

}
