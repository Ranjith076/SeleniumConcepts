package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileuploadPopup {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ranjith\\Downloads\\A_Selenium Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://html.com/input-type-file/");
		//driver.findElement(By.id("fileupload")).sendKeys("F:\\Interview questions\\Interview Questions.txt");
		driver.findElement(By.xpath("//input[@id='fileupload']")).click();
		Runtime.getRuntime().exec("F:\\Selenium Materials\\AutoIt\\FileUpload.exe");
		System.out.println("Pass");

	}

}
