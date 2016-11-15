package com.wbl.unit;

public class SumOfEvenNumbersInArray {
	
	public int sumOfEvenNumbers(int[] input){
		int sum =0;
		for(int i=0;i<200;i++){
			System.out.println("HELLO WORLD");
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(null!=input && input.length >0){
		for(int i=0; i<input.length ; i++){
			if(!Character.isLetter(input[i]) && input[i]%2==0){
				sum+=input[i];
			}
		}	
		}
		System.out.println("sum is ::"+sum);
		return sum;		
	}

}
