package com.wbl.unit;

public class PrimeNumber {
	
	public boolean isPrime(int input){
		boolean result = true;
		if(input==2 ){
			return true;
		}
		if(input==0 || input ==1){
			return false;
		}
		for(int i=2; i<input/2 ; i++){
			if(input%i ==0 ){
				result=false;
				break;
			}
		}
		return result;
	}

}
