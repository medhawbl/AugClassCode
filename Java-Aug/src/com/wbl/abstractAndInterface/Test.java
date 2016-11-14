package com.wbl.abstractAndInterface;

import com.wbl.basics.oops.UItraining;

public class Test {

	public final String greet;
	
	public Test(){
		greet = "hello";
	}
	
	public void test(){
		final Training t1 = new QaTraining();
		//t1 = new QaTraining();
		t1.courseContent="Java";
		t1.recordings="test";
		//t1= new JavaTraining();
		t1.courseContent="java";
		
		System.out.println(greet);
	}
	public static void main(String[] args) {
		Training t1 = new QaTraining();
         
	}

}
