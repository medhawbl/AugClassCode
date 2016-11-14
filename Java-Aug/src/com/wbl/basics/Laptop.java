package com.wbl.basics;

public class Laptop {
	
	//instance variables - state of the class
	String model;
	String color;
	String memory;
	
	
	//methods - behaviour of the class
	
	public void printModel(){
		System.out.println("Model is " +model);
	}
	public void printColor(){
		System.out.println("Color is " + color);
	}
	public void printMemory(){
		System.out.println("Memory is " +memory);
	}

	
	public static void main(String args[]){
		Laptop laptop = new Laptop();
		
		laptop.color="black";
		laptop.model="DELL";
		laptop.memory="8GB";
		
		laptop.printColor();
		laptop.printMemory();
		laptop.printModel();
		
      Laptop laptop1 = new Laptop();
		
		laptop1.color="white";
		laptop1.model="LENOVO";
		laptop1.memory="8GB";
		
		laptop1.printColor();
		laptop1.printMemory();
		laptop1.printModel();
		
	
	}
}
