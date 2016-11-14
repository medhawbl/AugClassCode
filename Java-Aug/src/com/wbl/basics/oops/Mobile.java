package com.wbl.basics.oops;

public class Mobile {
	
	protected String modelNumber;
	protected String color;
	
	/*public Mobile(String model,String color){
		this.modelNumber = model;
		this.color = color;
		
		System.out.println("Hello parameterised constructor");
		this.printMobileDetails();
	}*/
	
	
	  void printMobileDetails(){
		System.out.println("Hello mobile is: "+ this.modelNumber + ": this.color is :" + color);
		
	   }
	  
	 /* public void printDetails(){
			System.out.println("hello");
			//printMobileDetails();
		}*/
	  
	
	//Android-features, ios - specific , windows

}
