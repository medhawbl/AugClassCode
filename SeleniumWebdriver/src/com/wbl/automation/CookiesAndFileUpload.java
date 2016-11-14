package com.wbl.automation;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CookiesAndFileUpload {

	String LOCATION = System.getProperty("user.dir")+"\\resources\\drivers";
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass(){
		
		
		System.setProperty("webdriver.gecko.driver",LOCATION+"\\geckodriver.exe" );
		
		driver = new FirefoxDriver();
	}
	
	
	@Test
	public void test(){
		driver.get("http://www.ebay.com/");;
		
		Set<Cookie> cookies = driver.manage().getCookies();
		
		for(Cookie cook: cookies){
			System.out.println("Cookies::"+cook.getName());
		}
		
		System.out.println("size before::"+cookies.size());
		
		driver.manage().addCookie(new Cookie("test", "cookieTest"));
		
		cookies = driver.manage().getCookies();
		System.out.println("size after::"+cookies.size());
		
		for(Cookie cook: cookies){
			System.out.println("Cookies::"+cook.getName());
		}
		
		driver.close();
	}

}
