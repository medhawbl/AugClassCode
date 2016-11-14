package com.wbl.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeTest {

	@Test
	public void test(){
		    
		String LOCATION = System.getProperty("user.dir")+"\\resources\\drivers";
		
			System.setProperty("webdriver.chrome.driver",LOCATION+"\\chromedriver.exe" );
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://whiteboxqa.com");
			
			System.out.println("IN chrome:"+driver.getTitle());
	}
}
