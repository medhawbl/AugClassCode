package com.wbl.basics;

public class VariableScopes {

	//instance or global  variable
	String greeting = "hello";
	
	static String  institute = "WBL";
	
	public void printGreeting(String str){
		//inner or local  or method scope
		greeting = "hello world";
		System.out.println(str);
		
		{
			String greeting1 = "how are you";
			System.out.println(greeting1);
		}
	}
	
	int a=3;
	int b=4;
	public int sum(int a, int b){
		return a+b;
	}
	
	//"hello" "ehhhki"  "egjhj"
	public static void main(String args[]){
		VariableScopes vs = new VariableScopes();
		vs.printGreeting("greet");
		vs.sum(4, 5);
		
		vs.sum(4, 85);
		vs.sum(4, 85);
		
	}
}
