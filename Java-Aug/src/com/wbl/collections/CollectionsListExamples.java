package com.wbl.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsListExamples {
	
	
	
	public void arrayList(){
		List<String> listObj = new ArrayList<String>();
		listObj.add("hi");
		/*listObj.add(new Animal());
		listObj.add(new Dog());*/
		
		List<String> listObj1= new ArrayList<String>();
		
		listObj1.add("hello");
		listObj1.add("world");
		listObj1.add("hello34");
		System.out.println("before adding element::"+listObj1.size());
		
		System.out.println("after adding element using add::"+listObj1.size());
		/*for(int i=0;i<listObj1.size();i++){
			
			System.out.println(listObj1.get(i));
		}*/
		listObj.addAll(listObj1);
		System.out.println("after combinign 2 lists using addAll::"+listObj.size());
		System.out.println("remove by index::"+listObj.remove(1));
		//hi,hello,world,world,hello34
		System.out.println("after removing element using remove with index::"+listObj.size());
		System.out.println("remove by object::"+listObj.remove("world"));
		System.out.println("after removing element using remove with object::"+listObj.size());
	/*	for(int i=0;i<listObj.size();i++){
			System.out.println(listObj.get(i));
		}*/
		System.out.println("element is present or not::"+listObj.contains("hi"));
		//iterate - way 1
		System.out.println("USING FOR LOOP");
		/*for(int i=0;i<listObj1.size();i++){
			listObj1.add("world");
			System.out.println(listObj1.get(i));
		}*/
		
		//enhanced for loop--iterate - way 2
		System.out.println("USING ENHANCED FOR LOOP");
		for(String str : listObj1){
			listObj1.add(2,"hi");
			System.out.println(str);
		}
		
		//Iterator - that helps to iterate the collection data
		Iterator<String> itr = listObj1.iterator();
		System.out.println("USING ITERATORS");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
	
	
	
	public void vectorExample(){
		Vector<Integer> vector = new Vector<Integer>(4);
		
		vector.add(1);
		System.out.println("vector capacity before::"+ vector.capacity());
		vector.add(13);
		System.out.println("vector capacity before::"+ vector.capacity());
		vector.add(45);
		vector.add(45);
		vector.add(45);
		System.out.println("vector capacity after::"+ vector.capacity());
		for(Integer in: vector){
			System.out.println(in);
		}
		for(int i=0; i<vector.size();i++){
			System.out.println(vector.get(i));
		}
		Iterator<Integer> itr = vector.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
	public void linkedListExample(){
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("hello");
		llist.add("world");
		llist.add(1, "hi");
		llist.add("today");
		llist.add(null);
		llist.add(null);
		llist.addFirst("heyDre");
		llist.addLast("done!!");
		System.out.println(llist.peek());//gives very first element in queue
		System.out.println(llist.poll());//gives first element and also removes it from list
		for(String ll: llist){
			System.out.println(ll);
		}
	}
	
	public void listData(){
		List<Employee> emp = new ArrayList<Employee>();
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
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		Collections.sort(emp,new EmpComparator());
		
		for(Employee empData: emp){
			System.out.println("id::"+empData.id+"::name::"+empData.name);
		}
	}

	public static void main(String[] args) {
		CollectionsListExamples ce = new CollectionsListExamples();
		ce.listData();
	}

}
