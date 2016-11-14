package com.wbl.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsSetExamples {

	public void setExample(){
		Set<String> setObj = new LinkedHashSet<String>();
		setObj.add("hello");
		setObj.add("world");
		setObj.add("borld2");
		setObj.add("34world");
		setObj.add("corld45");
		setObj.add(null);
		setObj.add(null);
		setObj.add("hello");
		
		for(String str: setObj){
			System.out.println(str);
		}
	}
	
	public void set(){
		Set<Employee> set = new HashSet<Employee>();
		Employee e1 = new Employee();
		e1.adress="Fremont";
		e1.id=1;
		e1.name="Sanita";
		
		Employee e2 = new Employee();
		e2.adress="Fremont";
		e2.id=1;
		e2.name="Sanita";
		
		System.out.println("hashcode::"+e1.hashCode());
		System.out.println("hashcode::"+e2.hashCode());
		set.add(e1);
		set.add(e2);
		
		System.out.println("size::"+set.size());
	}
	
	public void treeSet(){
		Set<Employee> tset = new TreeSet<Employee>();
		Employee e1 = new Employee();
		e1.adress="Fremont";
		e1.id=1799;
		e1.name="Sanita";
		
		Employee e2 = new Employee();
		e2.adress="Fremont";
		e2.id=2;
		e2.name="Sanita";
		
		Employee e3 = new Employee();
		e3.adress="Fremont";
		e3.id=2000;
		e3.name="Sanita";
		
		tset.add(e1);
		tset.add(e2);
		tset.add(e3);
		
		
		for(Employee emp : tset){
			System.out.println("id::"+emp.id+"::name::"+emp.name);
		}
	}
	public static void main(String[] args) {
		CollectionsSetExamples ce = new CollectionsSetExamples();
		ce.treeSet();

	}

}
