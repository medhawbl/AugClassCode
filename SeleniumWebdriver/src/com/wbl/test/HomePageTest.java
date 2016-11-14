package com.wbl.test;

import static org.testng.Assert.*;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.wbl.automation.HomePage;



public class HomePageTest {

	HomePage hm = new HomePage();
	
	@Test
	public void verifySocialLinks(){
		List<WebElement> list =hm.getSocialNetworkingElements();
		System.out.println("list of elemnts::"+list.size());
		assertEquals(4, list.size());
	}
	
	@Test
	public void verifyLoginLink(){
		WebElement element = hm.getLoginLink();
		element.click();
	}
}
