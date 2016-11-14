package com.wbl.basics;

public class Sample {
	
	byte b  = 3;
	int num = 5678;
	short s = 6;
	long l= 67898985;
	
	float amount  = 56.45F; // its mandatory to give f at the end of declaration.
	double d = 45.68;// optional to give d or D at the end
	
	
	
	public static void main(String args[]){
		char ch = 'f';
		boolean isTrue = true;
		
		Sample s = new Sample();
		System.out.println(s.b);
		System.out.println(s.num);
		System.out.println(s.s);
		System.out.println(s.l);
		System.out.println(s.amount);
		System.out.println(s.d);
		System.out.println(isTrue);
		System.out.println(ch);
		}
	
	

}
