package com.wbl.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxTest {
	
	@Test
	public void test(){
		    
		String LOCATION = System.getProperty("user.dir")+"\\resources\\drivers";
		
			System.setProperty("webdriver.gecko.driver",LOCATION+"\\geckodriver.exe" );
			
			WebDriver driver = new FirefoxDriver();
			
			driver.get("http://whiteboxqa.com");
			
			System.out.println("IN FIREFOX:"+driver.getTitle());
	}

}
