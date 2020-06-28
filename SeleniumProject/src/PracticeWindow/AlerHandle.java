package PracticeWindow;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlerHandle {

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
		
		Iterator<String>it = handle.iterator();
		
		String parentWindowId=it.next();
		System.out.println("Parent Window id is : "+ parentWindowId);
		
		
		String childWindowId=it.next();
		System.out.println("Child Window id is : "+ childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println("Child Window Title is :"+ driver.getTitle());
		driver.close();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent Window Tile is :"+ driver.getTitle());
		driver.close();
		
	}

}
