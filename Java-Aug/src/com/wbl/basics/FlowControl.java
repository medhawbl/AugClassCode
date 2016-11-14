package com.wbl.basics;

public class FlowControl {
	
	
	public void ifElseExample(int input ){
		
		
		// number is div by 3 & 5
		
		if(input%3==0 && input %5==0 ){
			System.out.println("Number is div by 3 and 5");
		}else if(input%3==0){
			System.out.println("Number is div by 3");
		}else if(input%5==0){
			System.out.println("Number is div by 5");
		}
		else{
			System.out.println("Number is not div by 3 and 5");
		}
		
	}
	
	public void switchCaseExample(String day){
		
		switch(day){
		case "Mon": 
			System.out.println("Today is monday");
			break;
		case "Tue": 
			System.out.println("Today is Tuesday");
			break;
		case "Wed": 
			System.out.println("Today is Wednesday");
			break;
		case "Thu": 
			System.out.println("Today is Thursday");
			break;
		case "Fri": 
			System.out.println("Today is Friday");
			break;
		case "Sat": 
			System.out.println("Today is Saturday");
		default:
				System.out.println("Today is Sunday");
		}
		
		System.out.println("completed execution");
	}
	
	public void loopsExample(){
		 int count = 11;
		 
		/*while(count>=0){
			System.out.println("count is :"+ count);
			count--;
		}*/
		
		
		do{
			System.out.println("count is :"+ count);
			count--;
			//System.out.println(count);
		}while(count>=0);
	}
	
	public void forLoop(){
		// initiasation, condition check, increment/decrement
		
		/*for(int i =0; i<10 ; i++){
			System.out.println("value is :"+(i));
			
			if(i>5){
				System.out.println("exit the loop");
				break;
			}
		}
		
		//enhanced for loop
		String[] names = {"smita","shiva","bindu"};
		for(int i=0; i<names.length ; i++){
			System.out.println("student is : " + names[i]);
		}
		*/
		
		
		String[] names = {"smita","shiva","bindu"};
		int[] arr = {1,2,3};// internally jvm cast this t0 Integer
		for(int anyName : arr){
			System.out.println("student is : " + anyName);
		}
	}
	
	

	public static void main(String[] args) {
		
		  FlowControl fc = new FlowControl();
		  //fc.ifElseExample(5);
		  
		 // fc.switchCaseExample("Tue");
		  
		  fc.forLoop();
		  System.out.println("finished...");
	}

}
