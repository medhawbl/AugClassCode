package com.wbl.basics;

public class Operators {
	
	public void otherOperators(){
		
		int a = 3; // assignment operator
		int b = 5;
		
		// both condns are true - then only result of condition is true
		if((a>b) && (b!=0)){
			System.out.println("Both conditions are true");
		}
		
		a = a+2; a+=2;
		a= a*4;   a*=4;
		//+=, -=, /=
		
		//ternary operator - three operands - ?:
		
		// if num is div by 2 - true, else - false
		int num = 8;
		
		String result ="";
		
		if(num%2 == 0){
			result = "true";
		}else{
			result = "false";
		}
		
		int res = (num%2==0) ? (a+b) : (a-b);
		
		boolean c = 4+(5*2)>7;
		
		byte b1= 40;
		byte b2 = 50;
		if(b1==b2){
			
		}
		
		
		
	}
	
	public static void main(String args[]){
		byte a = 2, b= 1;
		System.out.println("sum::"+(a+b));
		System.out.println("subtract::"+(a-b));
		System.out.println("multiply::"+(a*b));
		System.out.println("Div- quotient::"+(a/b));
		System.out.println("Div- remainder::"+(a%b));
		System.out.println("bitwise left shift::"+(a<<b));
		System.out.println(Integer.toBinaryString(a));
		System.out.println("bitwise right shift::"+(a>>b));
		System.out.println("Unary pre increment::"+(++a));
		//3
		System.out.println("Unary post increment::"+(a++)); // 3
		
		 System.out.println("after post increment"+ a);//4
		
		 boolean b1 = false ;
		
	System.out.println("not :: " + (!b1));		
	
		Operators op = new Operators();
		op.otherOperators();
	}

}
