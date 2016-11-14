package com.wbl.automation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ActionsExample {
	
	String LOCATION = System.getProperty("user.dir")+"\\resources\\drivers";
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass(){
		System.setProperty("webdriver.chrome.driver",LOCATION+"\\chromedriver.exe" );
		
		ChromeOptions cm = new ChromeOptions();
		
		cm.addArguments("--disable-notifications");
		
		FirefoxProfile ff = new FirefoxProfile();
		
		
		DesiredCapabilities ds = new DesiredCapabilities();
		
		ds.setCapability("javascriptEnabled", false);
		
		ds.getCapability("cssSelectorsEnabled");
		
		
		driver = new ChromeDriver(ds);
	}
	
	@Test
	public void mouseActions(){
		try{
		driver.get("http://www.jabong.com/");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		WebElement mainElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='mainTopNav']/li[4]/a")));
		
		//WebElement mainElement = driver.findElement(By.linkText("Fashion"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(mainElement).perform();
		
		
		WebElement subElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Jewelry")));
		
		
		actions.moveToElement(subElement).click().perform();
		
		System.out.println("title of next page::"+driver.findElement(By.tagName("h1")).getText());
		
		
			
		}catch(Exception e){
			   
				System.out.println("in exception>>>>>>>>>>>>>>");
			    File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			    
			    try {
					FileUtils.copyFile(file, new File("C:/Users/WBL/Desktop/screenshotFile.png"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    
		}
		
	}
	
	
	@Test
	public void dragAndDrop() throws InterruptedException{
		
		driver.get("http://demo.tutorialzine.com/2009/09/shopping-cart-php-jquery/demo.php");;
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement from = driver.findElement(By.xpath(".//*[@src='img/products/iPod.png']"));
		
		WebElement to = driver.findElement(By.id("cart-icon"));
		
		Actions actions = new Actions(driver);
		
		//actions.dragAndDrop(from, to).perform();
		
		actions.clickAndHold(from).moveToElement(to).release(to).build().perform();
		
		//right click
		actions.contextClick().perform();
		
		Thread.sleep(2000);
		
		Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='item-list']")).isDisplayed());
		
		
	}

}
