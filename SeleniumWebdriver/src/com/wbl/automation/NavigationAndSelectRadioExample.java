package com.wbl.automation;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NavigationAndSelectRadioExample {

	String LOCATION = System.getProperty("user.dir")+"\\resources\\drivers";
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass(){
		System.setProperty("webdriver.chrome.driver",LOCATION+"\\chromedriver.exe" );
		
		driver = new ChromeDriver();
	}
	@Test
	public void navigate() throws InterruptedException{
		
		
		driver.navigate().to("https://dev.talentscreen.io");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Subjects")).click();
		
		WebElement element = driver.findElement(By.cssSelector(".text-display-2.margin-none"));
		System.out.println("header information::"+element.getText());
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		element = driver.findElement(By.className("tslogo"));
		assertTrue(element.isDisplayed());
		
		assertEquals(42,driver.findElements(By.xpath("//*[@title='Date']")).size());
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
		
	}
	
	@Test
	public void selectAndRadioExample() throws InterruptedException{
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("u_0_1")).sendKeys("WBLUSER");
		
		driver.findElement(By.id("u_0_3")).sendKeys("Training");
		
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("training@wbl.com");;
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("training@wbl.com");
		driver.findElement(By.cssSelector("#u_0_a")).sendKeys("password123");;
		
		WebElement element = driver.findElement(By.id("month"));		
		
		Select select = new Select(element);
		
		System.out.println("single select or not::"+select.isMultiple());
		
		select.selectByIndex(3);
		
		element = driver.findElement(By.id("day"));
		select = new Select(element);
		
		select.selectByValue("25");
		
		element = driver.findElement(By.id("year"));
		select = new Select(element);
		
		select.selectByVisibleText("2011");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("u_0_d")).click();
		
		Thread.sleep(3000);
		List<WebElement> radiobuttons = driver.findElements(By.cssSelector("._5k_2._5dba"));
		for(WebElement elm : radiobuttons){
			if(!elm.isSelected()){
				elm.click();
			}
		}
		Thread.sleep(3000);
		driver.close();
		//deselect works only for multiple select boxes
		//select.deselectByIndex(4);
		
	}
	
	@Test
	public void multipleSelectExample() throws InterruptedException{
		
		driver.get("http://wenzhixin.net.cn/p/multiple-select/docs/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement element = driver.findElement(By.className("w300"));
		Select select = new Select(element);
		
		System.out.println("single select or not::"+select.isMultiple());
		
		List<String> inputData = new ArrayList<String>();
		inputData.add("January");
		inputData.add("March");
		Thread.sleep(3000);
		
		
		for(String in: inputData){
		select.selectByVisibleText(in);
		Thread.sleep(3000);
		}
		
		Thread.sleep(3000);
		
		select.deselectAll();
		
		
		driver.close();
		//deselect works only for multiple select boxes
		//select.deselectByIndex(4);
		
	}
	
	

}
