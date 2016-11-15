package com.wbl.unit.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.wbl.unit.SumOfEvenNumbersInArray;

public class TestSumOfEvenNumbers_Junit4{
	SumOfEvenNumbersInArray actualObj = new SumOfEvenNumbersInArray();
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before class or before atleast one method is called");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("After class or after all methods are called");
	}
	
	@Before
	public void beforeMethod(){
		System.out.println("Runs before every test method");		
	}
	
	@After
	public void afterMethod(){
		System.out.println("Runs after every test method");
	}
	
	//test method calls actual method(which we want to test) and assert the o/p
	@Test
	public void isSumOfEvenNumbers(){
		int[] input = {6,7,9,4};
		
		int actualOutput = actualObj.sumOfEvenNumbers(input);
		int expectedOutput = 10;
		assertEquals(expectedOutput, actualOutput);
		
	}
	
	@Test
	public void isSumOfEvenNumbers1(){
		int[] input = {-6,7,9,-4};
		
		int actualOutput = actualObj.sumOfEvenNumbers(input);
		int expectedOutput = -10;
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	public void isSumOfEvenNumbers2(){
		int[] input = {0,0,0,0};
		
		int actualOutput = actualObj.sumOfEvenNumbers(input);
		int expectedOutput = 0;
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	public void isSumOfEvenNumbers3(){
		int[] input = null;
		
		int actualOutput = actualObj.sumOfEvenNumbers(input);
		int expectedOutput = 0;
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	public void isSumOfEvenNumbers4(){
		int[] input = {7,7,5,3,13};
		
		int actualOutput = actualObj.sumOfEvenNumbers(input);
		int expectedOutput = 0;
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test(timeout=1)
	public void isSumOfEvenNumbers6(){
		int[] input = {};
		long startTime = System.currentTimeMillis();
		int actualOutput = actualObj.sumOfEvenNumbers(input);
		int expectedOutput = 0;
		assertEquals(expectedOutput, actualOutput);
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("totalTime::"+totalTime);
	}
	
	@Ignore
	@Test
	public void isSumOfEvenNumbers5(){
		int[] input = {'a','b','h'};
		
		int actualOutput = actualObj.sumOfEvenNumbers(input);
		int expectedOutput = 0;
		assertEquals(expectedOutput, actualOutput);
	}

}
