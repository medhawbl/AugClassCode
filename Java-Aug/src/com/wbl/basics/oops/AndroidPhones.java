package com.wbl.basics.oops;

public class AndroidPhones extends Mobile {
	
	String manufacturer;
	
	public void getDetails(){
		printMobileDetails();
		System.out.println("data is " + manufacturer);
	}

}
