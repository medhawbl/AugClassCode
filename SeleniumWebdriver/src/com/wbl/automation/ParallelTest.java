package com.wbl.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {

	String LOCATION = System.getProperty("user.dir")+"\\resources\\drivers";
	
	@Parameters({"browserName"})
	@Test
	public void test(String browserName){
		 
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver",LOCATION+"\\chromedriver.exe" );
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://whiteboxqa.com");
			
			System.out.println("IN chrome:"+driver.getTitle());
		}else if(browserName.equals("firefox")){
            
			System.setProperty("webdriver.gecko.driver",LOCATION+"\\geckodriver.exe" );
			
			WebDriver driver = new FirefoxDriver();
			
			driver.get("http://whiteboxqa.com");
			
			System.out.println("IN FIREFOX:"+driver.getTitle());   
		}
	}
}
