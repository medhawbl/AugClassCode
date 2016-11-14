package com.wbl.basics;

public class ConstructorExample {
	
	String model;
	String color;
	int version;
	
	public ConstructorExample(){
		System.out.println("A new mobile is created..");
		this.version =10;
	}
	
	public ConstructorExample(String model){
		System.out.println("Hello no arguments constructor");
	}
	
	public ConstructorExample(String model,String color){
		this.model = model;
		this.color = color;
		
		System.out.println("Hello parameterised constructor");
		this.printMobileDetails();
	}
	
	public ConstructorExample(int num){
		System.out.println("Hello int arguments constructor");
	}
	
	public void printMobileDetails(){
		System.out.println("Hello mobile is: "+ this.model + ": this.color is :" + color);
	}
	
	
	
	public static void main(String args[]){
		ConstructorExample mobile = new ConstructorExample("samsung", "black");
		/*mobile.color= "black";
		mobile.model="samsung";*/
		
	}

}
