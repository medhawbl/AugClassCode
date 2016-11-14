package com.wbl.collections;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

	
	 int id;
	 String name;
	 String adress;
	
	 @Override
	 public int compareTo(Employee o) {
		
		String i1 = o.name;
		String i2 = this.name;
		/*if(e1.id < e2.id){
			result = -1;
		}else if(e1.id > e2.id){
			result = 1;
		}
		*/
		return i1.compareTo(i2);
	 }

	
	 
	 @Override
	 public int hashCode(){
		 return id*7;
	 }
	 
	 @Override
	 public boolean equals(Object o){
		 boolean isEqual= false;
		 if(o instanceof Employee){
			Employee e2 = (Employee)o;
			if(this.id == e2.id ){
			 isEqual = true;
			}
		 }
		 
		 
		 return isEqual;
	 }
	 
}
