package com.wbl.basics.oops;

import java.io.IOException;

public class QaTraining  extends Training{
	
	
	 // overriding the parent class method with specfic child class behaviour
	public QaTraining(){
		//super("greet");
		System.out.println("this is child class- training");
	}
	
	 @Override
	 public void courseContent() {
		 System.out.println("Java, Webdriver, testng, retapi- httpclient, mobile-appium");
	 }
	 
 public void test(){
		 
		 getRecordings();
		 lab();
		// super.courseContent();
	 }
	
	 //covariant return type is allowed in child class
	 @Override
	 public  IOS  getObject(){
			System.out.println("jhello");
			return new IOS();
	 }
	
	 
	 
	 

}
