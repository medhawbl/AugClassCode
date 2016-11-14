package com.wbl.automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileUpload {
	
	String LOCATION = System.getProperty("user.dir")+"\\resources\\drivers";
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass(){
		System.setProperty("webdriver.chrome.driver",LOCATION+"\\chromedriver.exe" );
				
		driver = new ChromeDriver();
	}
	
	@Test
	public void keyActionsWIthRobot() throws AWTException{
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("test@123");
		driver.findElement(By.id("pass")).sendKeys("dfgjdsk@123");
		/*
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.ENTER).perform();
		
		action.keyUp(Keys.ENTER).perform();*/
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	@Test
	public void fileUploadWithRobot() throws AWTException, InterruptedException, IOException{
		
		driver.get("http://my.monsterindia.com/create_account.html");
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		System.out.println("windows::"+driver.getWindowHandles().size());
		
		String win1 = driver.getWindowHandle();
		
		Set<String> wins = driver.getWindowHandles();
		
		for(String win: wins){
			if(!win.equalsIgnoreCase(win1)){
				driver.switchTo().window(win).close();
				break;
			}
		}
		
		driver.switchTo().window(win1);
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wordresume")));
		element.click();
		//method1-using autoit for fileupload
		
		Runtime.getRuntime().exec("C:\\Users\\WBL\\Desktop\\autoItFileUpload.exe");
		
		Thread.sleep(2000);
		
		driver.close();
		
		//method2--using robot for fileupload
		/*StringSelection selectPath = new StringSelection("C:\\Users\\WBL\\Desktop\\codingtest-13-10-16.txt");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents
		(selectPath,null);
		
		Robot robot = new Robot();
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(2000);
		*/
		
	}

}
