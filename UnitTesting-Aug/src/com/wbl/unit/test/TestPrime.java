package com.wbl.unit.test;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.wbl.unit.ExcelUtils;
import com.wbl.unit.PrimeNumber;


@RunWith(Parameterized.class)
public class TestPrime {
	
	boolean expected;
	int input;
	
	public TestPrime(boolean expected,int input){
		this.expected = expected;
		this.input = input;
	}
	
	@Parameters
	public static Object[][] dataForTest() throws FileNotFoundException{
		Object[][] data = {{true,5},{false,10},{true,2},{false,0},{false,1},{true,-3}};
		return data;
	}
	
	
	@Test
	public void testPrime(){
		PrimeNumber pm = new PrimeNumber();
		assertEquals(expected, pm.isPrime(input));
	}
	

}
