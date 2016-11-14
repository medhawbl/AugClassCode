package com.wbl.collections;

public class EqualsAndHashcode {

	
	
	public static void main(String args[]){
		/*Integer i1 = new Integer(34);
		Integer i2 = new Integer(34);*/
		Employee e1 = new Employee();
		e1.adress="Fremont";
		e1.id=1;
		e1.name="Sanita";
		
		Employee e2 = new Employee();
		e2.adress="Dublin";
		e2.id=1;
		e2.name="Sanita";
		
		System.out.println("hascode  e1::"+e1.hashCode());
		System.out.println("hashcode   e2::"+e2.hashCode());
		
		 if(e1.equals(e2)){
			 System.out.println("both are equal");
		 }else{
			 System.out.println("not equal");
		 }
		
	}
}
