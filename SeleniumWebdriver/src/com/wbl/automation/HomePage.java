package com.wbl.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	
	String LOCATION = "C:\\Users\\WBL\\MedhaWorkspace\\SeleniumWebdriver\\resources\\drivers";
	
	public List<WebElement> getSocialNetworkingElements(){
		System.setProperty("webdriver.chrome.driver",LOCATION+"\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://whiteboxqa.com/");
		List<WebElement> list = driver.findElements(By.xpath(".//*[@class='container']/u/li"));
		//find elements can also be used to check element presence
		if(list.isEmpty()){
			System.out.println("element is not present::");
		}
		System.out.println("list count::"+list.size());
		return list;
	}
	
	
	public WebElement getLoginLink(){
		
		System.setProperty("webdriver.chrome.driver",LOCATION+"\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://whiteboxqa.com/");
		WebElement element =driver.findElement(By.id("loginutton"));
		return element;
	}

}
