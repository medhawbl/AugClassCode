package com.wbl.basics.oops;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Sum {
	
	String greet = "hello";
	int c;
	
	/*public Sum(){
		c=0;
		System.out.println("this is a default constructor-- this is called whenever I am creating object");
	}
	
	public Sum(String greet){
		this.greet = greet;
		System.out.println("this is a  parameterised constructor-- this is called whenever I am creating object");
	}*/
	
	
	//byte-short-int-long
	//method overloading
	public  int performSum(byte a, byte b ) {
		System.out.println(greet);
		c = a+b;
		System.out.println("byte - Sum is: "+c);
		return c;
	}
	
	public int performSum(int a, int b ){
		System.out.println(greet);
		c = a+b;
		System.out.println("int - Sum is: "+c);
		return c;
	}
	
	public long performSum(long a, long b ) throws FileNotFoundException{
		System.out.println(greet);
		long c = a+b;
		System.out.println("long - Sum is: "+c);
		return c;
	}
	
	
	public void performSum(int a, int b , int c){
		System.out.println(greet);
		int d = a+b+c;
		System.out.println(" 3 ints - Sum is: "+d);
		//return d;
	}
	
	public double performSum(double a, double b ){
		System.out.println(greet);
		double c = a+b;
		System.out.println("double - Sum is: "+c);
		return c;
	}

	public static void main(String[] args) throws IOException{
	
		File f1 = new File("test.txt");
		if(f1.isFile()){
			f1.createNewFile();
		}
		
		byte b1 = 12;
		byte b2=13;
		Sum s = null;// constructor is called
		s.performSum(40, 50, 70);
		s.performSum(56.23, 45.23);
		s.performSum(b1, b2);

	}

}
