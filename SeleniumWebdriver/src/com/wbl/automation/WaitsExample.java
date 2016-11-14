package com.wbl.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

public class WaitsExample {
	
	String LOCATION = System.getProperty("user.dir")+"\\resources\\drivers";
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass(){
		System.setProperty("webdriver.chrome.driver",LOCATION+"\\chromedriver.exe" );
		
		driver = new ChromeDriver();
	}
	
	@Test
	public void implicitWait(){
		driver.get("https://dev.talentscreen.io");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Subects")).click();
		
		System.out.println("logo present::"+driver.findElement(By.className("tslogo")).isDisplayed());
		
		WebElement element= driver.findElement(By.xpath("//*[text()='ASP.NET Web Forms']"));
		
		System.out.println("subject::"+element.getText());
		
		element=driver.findElement(By.cssSelector(".text-display-2.margin-none"));
		
		System.out.println("title::"+element.getText());
		
		
		driver.close();
	}
	
	@Test
	public void explicitWait(){
		driver.get("https://dev.talentscreen.io");
		
		driver.findElement(By.linkText("Subjects")).click();
		
		System.out.println("logo present::"+driver.findElement(By.className("tslogo")).isDisplayed());
		
		//explicit wait checks for condition by default for every 500ms ...
		WebDriverWait wait = new WebDriverWait(driver,20);

		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated
						(By.xpath("//*[text()='ASP.NET Web Forms']")));
		
		
		
		System.out.println("subject::"+element.getText());
		
		element=wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".text-display-2.margin-none")));
		
		System.out.println("title::"+element.getText());
		
		
		driver.close();
	}
	
	@Test
	public void fluentWaitExample(){
		
		driver.get("https://www.yelp.com");
		
		WebElement element = driver.findElement(By.id("find_desc"));
		
		element.sendKeys("pizz");
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
							.pollingEvery(10, TimeUnit.SECONDS)
							.withTimeout(30, TimeUnit.SECONDS)
							.ignoring(NoSuchElementException.class);
		
		WebElement elem =wait.until(function);
				                   
		System.out.println("title::"+elem);
		
		System.out.println(driver.findElement(By.tagName("h1")).getText());
		
		driver.close();
	}
	
	Function<WebDriver,WebElement> function = new Function<WebDriver,WebElement>() {

		@Override
		public WebElement apply(WebDriver arg0) {
			
			WebDriverWait wait = new WebDriverWait(driver,20);

			List<WebElement> elements  = wait
					.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//*[@class='suggestions-list']/li")));
			
			WebElement elem=null;
			for(WebElement ele: elements){
				if(ele.getText().equalsIgnoreCase("pizza restaurants")){
					elem=ele;
					ele.click();
					break;
				}
			}
			return elem;
		}
		
		
	};
	
	Predicate<WebDriver> pr = new Predicate<WebDriver>() {

		@Override
		public boolean apply(WebDriver arg0) {
			
			WebDriverWait wait = new WebDriverWait(driver,20);

			List<WebElement> elements  = wait
					.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//*[@class='suggestions-list']/li")));
			
			WebElement elem=null;
			for(WebElement ele: elements){
				if(ele.getText().equalsIgnoreCase("pizza restaurants")){
					elem=ele;
					ele.click();
					break;
				}
			}
			return true;
		}
		
		
	};

}
