package com.wbl.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JavaScriptExecutor {
	
	String LOCATION = System.getProperty("user.dir")+"\\resources\\drivers";
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass(){
		
		
		System.setProperty("webdriver.chrome.driver",LOCATION+"\\chromedriver.exe" );
		
		driver = new ChromeDriver();
	}
	
	@Test
	public void scrollWIthJSExecutor() throws InterruptedException{
		
		driver.get("http://www.ebay.com/");;
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//to scroll to the end of the page
		//((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		WebElement element = driver.findElement(By.xpath(".//*[@class='daily-deals-title']"));
		//scroll until a particular element is found
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
		
		//scroll down & up
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,800)");
		

		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-400)");
		
		Thread.sleep(2000);
		
		driver.close();
	}
	
	
	@Test
	public void jsExecutions() throws InterruptedException{
		driver.get("http://www.ebay.com/");;
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement element = (WebElement)((JavascriptExecutor)driver).executeScript("return document.getElementById('gh-btn')");
		
		element.click();
		
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("alert('hello')");
		
		Thread.sleep(2000);
		driver.close();
	}

}
