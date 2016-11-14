package com.wbl.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics_WblHomePage {

	static String LOCATION = "C:\\Users\\WBL\\MedhaWorkspace\\SeleniumWebdriver\\resources\\drivers";
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",LOCATION+"\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://whiteboxqa.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("loginButton")).click();
		System.out.println("currentUrl::"+driver.getCurrentUrl());
		System.out.println("pageSource::"+driver.getPageSource());
		System.out.println("title::"+driver.getTitle());
		
		WebElement element = driver.findElement(By.name("uname"));
		element.sendKeys("Test123");
		element.clear();
		
		driver.findElement(By.id("password")).sendKeys("password123");
		
		driver.findElement(By.id("login")).submit();
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
