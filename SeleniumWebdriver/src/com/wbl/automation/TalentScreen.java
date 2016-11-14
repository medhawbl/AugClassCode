package com.wbl.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TalentScreen {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\resources\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://dev.talentscreen.io/");

		driver.findElement(By.linkText("Subjects")).click();
		Thread.sleep(5000);;
		System.out.println(driver.findElement(By.cssSelector(".text-display-2 margin-none")).getText());
		
		
		driver.quit();
	}

}
