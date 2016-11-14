package com.wbl.helper;

import com.wbl.basics.oops.Mobile;

public class Test extends Mobile {
	
	
	public void test(){
		
		Mobile m = new Mobile();
		//protected var's outside the package can be accessed only thru inheritance
		System.out.println(color);
		printMobileDetails();
	}
	
	 void printMobileDetails(){
			System.out.println("Hello mobile is: "+ this.modelNumber + ": this.color is :" + color);
			
		}
	
	public static void main(String args[]){
		//VariableScopes vs = new VariableScopes();
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		//Calculator calc = new Calculator();
		//Calculator.doCalulation();
	
	}

}
