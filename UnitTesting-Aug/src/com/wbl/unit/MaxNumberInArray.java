package com.wbl.unit;

public class MaxNumberInArray {
	
	
	public double findMaxInArray(double[] input) throws ArrayIndexOutOfBoundsException{
		double max=input[0];
		for(int i=1;i<input.length;i++){
			if(input[i]>max){
				max= input[i];
			}
		}
		
		return max;
		
	}

}
