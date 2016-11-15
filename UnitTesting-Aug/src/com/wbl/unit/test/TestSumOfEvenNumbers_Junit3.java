package com.wbl.unit.test;

import com.wbl.unit.SumOfEvenNumbersInArray;

import junit.framework.TestCase;

public class TestSumOfEvenNumbers_Junit3 extends TestCase {
	
	public void setUp(){
		System.out.println("Runs before every test method");
	}
	
	public void tearDown(){
		System.out.println("Runs after every test method");
	}
	
	//test method calls actual method(which we want to test) and assert the o/p
	public void testSumOfEvenNumbers(){
		int[] input = {6,7,9,4};
		SumOfEvenNumbersInArray actualObj = new SumOfEvenNumbersInArray();
		int actualOutput = actualObj.sumOfEvenNumbers(input);
		int expectedOutput = 10;
		assertEquals(expectedOutput, actualOutput);
		
	}
	
	public void testSumOfEvenNumbers1(){
		int[] input = {-6,7,9,-4};
		SumOfEvenNumbersInArray actualObj = new SumOfEvenNumbersInArray();
		int actualOutput = actualObj.sumOfEvenNumbers(input);
		int expectedOutput = -10;
		assertEquals(expectedOutput, actualOutput);
	}
	
	
	public void testSumOfEvenNumbers2(){
		int[] input = {0,0,0,0};
		SumOfEvenNumbersInArray actualObj = new SumOfEvenNumbersInArray();
		int actualOutput = actualObj.sumOfEvenNumbers(input);
		int expectedOutput = 0;
		assertEquals(expectedOutput, actualOutput);
	}
	
	
	public void testSumOfEvenNumbers3(){
		int[] input = null;
		SumOfEvenNumbersInArray actualObj = new SumOfEvenNumbersInArray();
		int actualOutput = actualObj.sumOfEvenNumbers(input);
		int expectedOutput = 0;
		assertEquals(expectedOutput, actualOutput);
	}
	
	public void testSumOfEvenNumbers4(){
		int[] input = {7,7,5,3,13};
		SumOfEvenNumbersInArray actualObj = new SumOfEvenNumbersInArray();
		int actualOutput = actualObj.sumOfEvenNumbers(input);
		int expectedOutput = 0;
		assertEquals(expectedOutput, actualOutput);
	}
	public void testSumOfEvenNumbers6(){
		int[] input = {};
		SumOfEvenNumbersInArray actualObj = new SumOfEvenNumbersInArray();
		int actualOutput = actualObj.sumOfEvenNumbers(input);
		int expectedOutput = 0;
		assertEquals(expectedOutput, actualOutput);
	}
	
	public void testSumOfEvenNumbers5(){
		int[] input = {'a','b','h'};
		SumOfEvenNumbersInArray actualObj = new SumOfEvenNumbersInArray();
		int actualOutput = actualObj.sumOfEvenNumbers(input);
		int expectedOutput = 0;
		assertEquals(expectedOutput, actualOutput);
	}

}
