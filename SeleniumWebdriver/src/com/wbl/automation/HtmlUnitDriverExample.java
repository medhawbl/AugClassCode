package com.wbl.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HtmlUnitDriverExample {

	WebDriver driver;
	
	@Test
	public void test(){
		driver = new HtmlUnitDriver(BrowserVersion.CHROME);
		
		driver.get("http://google.com");
		
		System.out.println("title::"+driver.getTitle());
		
		
	}
}
