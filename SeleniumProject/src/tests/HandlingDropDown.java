package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ranjith\\Downloads\\A_Selenium Installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://community.ebay.com/t5/Half-com/bd-p/21000000002");
		Thread.sleep(10000);
		Select select = new Select(driver.findElement(By.name("searchGranularity")));
		
		//***************** To select the values in drop-down *****************
		//select.selectByVisibleText("Users"); 
		//select.selectByIndex(index);
		//select.selectByValue(arg0);
		
		// ******** Sorting of WebElements using "Collections.sort()" ************ 
		
		List<WebElement> lst=select.getOptions(); // getting the all the drop-down values        
		ArrayList<String> lst1 = new ArrayList<String>();
		for(int i=0;i<lst.size();i++) {
			
			lst1.add(lst.get(i).getText().toString());
			//System.out.println(lst.get(i).getText());
		}
		
		System.out.println("*** Before Sorting ******");
		System.out.println(lst1);
		System.out.println("*** After Sorting ******");
		Collections.sort(lst1);                  // Sorting all the ArrayList values
		System.out.println(lst1);
	}

}
