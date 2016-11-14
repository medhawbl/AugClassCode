package com.wbl.arraysAndStrings;

public class ArrayExample {
	
	/*//declaration of instance/global variables but did not initialise
	String greet ;// object
	int i;// literals or primitives
	Integer intObject;//wrapper class object
*/	
	
			
	
	
	public void test(){

		//declaration of local variables but did not initialise
		String greet = "hello";// object
		int i;// literals or primitives
		Integer intObject;//wrapper class object
		//initialisation
		greet = "hello";
		i=5;
		intObject=6;
		System.out.println("string object::"+greet);
		System.out.println("int primitive::"+i);
		System.out.println("Integer object::"+intObject);
	}
	
	public void arrays(){
		//method 1 to declare,initialise and assign values to array
		//declare an arrays
	    Integer[] intArray ;
		//initilaize
		intArray = new Integer[5];
		System.out.println(intArray);
		
		System.out.println(intArray[0]);
		
		
		
		int[] intArray1 = new int[5];
		
		//assigning values to the array elements
		intArray1[0]= 5;
		intArray1[1]= 6;
		intArray1[2]= 7;
		intArray1[3]= 7;
		intArray1[4]= 3;
		
		//iterating the array data
		for(int i=0; i<intArray1.length; i++){
			System.out.println("helo array ::"+intArray1[i]);
		}
		
		System.out.println("third value::"+intArray1[2]);
		
		
		//method 2 to assign value to array
		String[] greetings = {"hello", "hi", "how r u"};
		//iterating the array data
		for(int i =0; i<greetings.length; i++){
			System.out.println(greetings[i]);
		}
		
		//assigning values thru for loop
		long[] longArr = new long[10];
		for(int i=0;i<longArr.length;i++){
			longArr[i]= 50;
		}
		//iterating the array data
		for(int i=0;i<longArr.length;i++){
			System.out.println(longArr[i]);
		}
		
		//method 3 to initialise array- anonymous array declaration
		char[] chArr = new char[]{'g','h'};
		System.out.println(chArr[1]);
		
	}
	
	public void multidimensionalArrays(){
		//2 dimensional array
		int[][] intArr = new int[2][];// it allocates memory of 2 array objects
		intArr[0]= new int[3];
		intArr[1]= new int[2];
		//initilasing values
		intArr[0][0]=10;
		intArr[0][1]=20;
		intArr[0][2]=30;
		
		intArr[1][0]=10;
		intArr[1][1]=20;
		
		//System.out.println(intArr[0][1]);
		
		System.out.println(intArr[1].length);
		if(null!=intArr && intArr.length>0){
		//iterating multi domensional arrays
		  for(int i =0; i< intArr.length;i++){
			  for(int j=0;j<intArr[i].length;j++){
			  System.out.println(intArr[i][j]);
			  }
		  }
		}
		  
		  //method 2 to initialse values at atime
		  String[][] greets = {{"hello","hi"},{"howru"},{"heydre","howdoudo"}};
		  //method2- anonymous way
		  String[][] greets1 = new String[][]{{"hello","hi"},{"howru"},{"heydre","howdoudo"}};
		
	}
	
	public void objectArrays(){
		Animal[] animals = new Animal[3];
		Animal animal1 =new Dog();
		animal1.name="scooby";
		Animal animal2=new Dog();
		animal2.name="rex";
		Animal animal3 =new Dog();
		animal3.name="puppy";
		animals[0]= animal1;
		animals[1]= animal2;
		animals[2]= animal3;
		//normal loop
		for(int i=0;i<animals.length;i++){
			animals[i].makenoise();
		}
		
		//iterating with enhanced for loop
		for(Animal ani:animals){
			ani.makenoise();
		}
		
		Object[] objArr = {6, 7, "hello", 7.5};
	}
	

	public static void main(String[] args) {
		ArrayExample ae = new ArrayExample();
		ae.arrays();
	}

}
