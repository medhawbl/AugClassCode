package com.wbl.automation;

import java.util.List;
import static org.testng.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebElementMethods {

	String LOCATION = System.getProperty("user.dir")+"\\resources\\drivers";
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass(){
		System.setProperty("webdriver.chrome.driver",LOCATION+"\\chromedriver.exe" );
		
		driver = new ChromeDriver();
	}
	
	@Test
	public void webElementMethods(){
		driver.get("http://whiteboxqa.com");
		driver.findElement(By.linkText("Login")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='breadcrumbs-list']/li"));
		
		for(WebElement element: elements){
			System.out.println(element.getText());
			if(element.getText().equals("Home")){
				element.findElements(By.linkText("Home")).get(0).click();
				break;
			}
		}
		
		WebElement element =driver.findElement(By.xpath(".//*[@id='logo']"));
		Dimension dimension = element.getSize();
		System.out.println("height::"+dimension.getHeight());
		System.out.println("width::"+dimension.width);
		
		Point point = element.getLocation();
		System.out.println("x::"+point.x);
		System.out.println("y::"+point.y);
		
		element = driver.findElement(By.cssSelector("#headerfblogin"));
		System.out.println("element is enabled or not::"+element.isEnabled());
		
		System.out.println("element is displayed::"+element.isDisplayed());
		
		assertEquals("button", element.getAttribute("type"));
		
		System.out.println("css value:;"+element.getCssValue("font-family"));
		System.out.println("css value:;"+element.getCssValue("color"));
		
		assertEquals("button",element.getTagName());
	
		
	}
	
	@AfterClass
	public void afterClass(){
		driver.close();
	}
}
