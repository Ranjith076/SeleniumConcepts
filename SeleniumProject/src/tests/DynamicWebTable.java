package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ranjith\\Downloads\\A_Selenium Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/");
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")).click();
		driver.findElement(By.name("email")).sendKeys("ranjith.sit.cs@gmail.com");
		driver.findElement(By.name("password")).sendKeys("R@njith076");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[3]")).click();
		
		String data1= "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
		String data2= "]/td[2]";
		String data3= "]/td[4]";
		
		for(int i=1;i<=2;i++) {
			
			Thread.sleep(2000);
			String name = driver.findElement(By.xpath(data1+i+data2)).getText();
			String address= driver.findElement(By.xpath(data1+i+data3)).getText();
			if(name.contains("Ranjith C")) {
				System.out.println(name+" "+address);
			}
			
			
		}
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[2]
		
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[4]
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[4]
		
		
		
		

	}

}
