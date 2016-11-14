package com.wbl.automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesExample {

	static String LOCATION = "C:\\Users\\WBL\\MedhaWorkspace\\SeleniumWebdriver\\resources\\drivers";
	public static void main(String[] args) throws InterruptedException {
		int i=7/2;
		System.out.println(i);
		System.setProperty("webdriver.chrome.driver",LOCATION+"\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://whiteboxqa.com/");

		driver.findElement(By.id("headerfblogin")).click();
		
		//get current window name
		String currentWindowName = driver.getWindowHandle();
		System.out.println("current windowname::"+currentWindowName);
		//gives all windows that are open
		Set<String> windows = driver.getWindowHandles();
		System.out.println("count of windows::"+windows.size());
		//iterating over windows and trying to switch to child window
		for(String win: windows){
			System.out.println("windowname::"+win);
			//making sure that we are switching to child window but not parent window
			if(!win.equals(currentWindowName)){
				driver.switchTo().window(win);
				//in each window
			}
		}
		
		
		//driver.switchTo().window("CDwindow-ff07da77-4e21-4b4e-a78f-a78736c5f001");
		
		driver.findElement(By.name("email")).sendKeys("Test123");
		driver.findElement(By.name("pass")).sendKeys("Pwd123");
		
		Thread.sleep(5000);;
		driver.quit();
	}

}
