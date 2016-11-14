package com.wbl.arraysAndStrings;

public class StringClass {
	
	public void stringBasics(){
		char[] ch={'h','e','l'};
		//StringObjects - create string using object notation - new keyword
		String greet = new String("hello");
		greet="helo";
		greet = greet.concat("world");
		System.out.println(greet);
		
		//Creating strings using string literals
		String s1Obj=new String("hello");//string literal- this stores string value in string constant pool
		String s2Obj=new String("hello");
		
		//Creating strings using string literals
		String s1="hello";//string literal- this stores string value in string constant pool
		String s2="hello";
		s1=s1.concat("world");
		s1=s1+"cool";
		System.out.println(s1);
		if(s1Obj.equals(s2Obj)){
			System.out.println("they are equal");
		}else{
			System.out.println("not equal");
		}
		
		final int i=5;
	}
	
	public void stringImpMethods(){
		String s = "hello";
		//concat- to append a value
		s=s.concat("world");
		System.out.println(s);
		
		//specfic character in string
		System.out.println(s.charAt(1));
		
		//substring of given string
		System.out.println(s.substring(0,2));//only strt index
		String st="JavaWorld";
		System.out.println(st.substring(0, 4));
		//trim the spaces
		String st1="  JavaWorld   ";
		System.out.println(st1.trim());
		//case
		System.out.println(st1.toUpperCase());
		//replace
		String str = "coolGear";
		System.out.println(str.replace('c', 'p'));
		String str1 = str.replace('c', 'p');
		System.out.println("original string:"+str);
		if(str.endsWith("Gear")){
			System.out.println("yes it starts with cool");
		}
		String fileName = "test.design.xls";
		System.out.println(str.indexOf('G'));
		int index = fileName.lastIndexOf('.')+1;
		String extension = fileName.substring(index);
		if(extension.equalsIgnoreCase("XLS")){
			System.out.println("yes it is an excel file");
		}
		char[] ch = fileName.toCharArray();
		
	}
	
	public String reverseString(String input){
		//hello
		String output;
		char[] temArray = new char[input.length()];
		int j=0;
		int count=input.length()-1;
		for(int i=count ; i>=0; i--){
			//0 , l , l , e, h
			temArray[j]= input.charAt(i);
			j++;
		}
		output = new String(temArray);
		return output;
	}
	
	public void stringBufferBuilder(){
		
		//StringBuffer str = new StringBuffer("wbl");
		StringBuilder str = new StringBuilder("wbl");
		str.append("training");//append also takes other datatypes like int,long,float...
		System.out.println("original string:"+ str);
		System.out.println("delete char::"+str.deleteCharAt(1));
		System.out.println("reverse string:"+ str.reverse());
		System.out.println("insert char:"+str.insert(3, '*'));
		
	}

	public static void main(String[] args) {
		StringClass sc = new StringClass();
		
		//System.out.println("reverse is :"+sc.reverseString("hello"));
		sc.stringImpMethods();
	}

}
