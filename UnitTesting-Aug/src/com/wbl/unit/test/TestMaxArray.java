package com.wbl.unit.test;


import static org.junit.Assert.*;
import org.junit.Test;

import com.wbl.unit.MaxNumberInArray;

public class TestMaxArray {
	
	MaxNumberInArray maxArrayObj = new MaxNumberInArray();

	@Test
	public void testFindMaxInArray(){
		double[] input = {6,7,8,4,40};
		double actual = maxArrayObj.findMaxInArray(input);
		assertEquals(40,actual, 0.0);
	}
	
	@Test
	public void testFindMaxInArray1(){
		double[] input = {6.67,7,8,-4,40};
		double actual = maxArrayObj.findMaxInArray(input);
		assertEquals(40,actual, 0.0);
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testFindMaxInArray2(){
		double[] input = {};
		double actual = maxArrayObj.findMaxInArray(input);
		assertEquals(40,actual, 0.0);
	}
	
	
	
}
