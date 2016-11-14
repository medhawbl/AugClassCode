package com.wbl.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QueueExample {

	
	public void queue(){
		Queue<Employee> queue = new PriorityQueue<Employee>();
		
		//declaring prioroty queue using comparator
		//Queue<Employee> queue = new PriorityQueue<Employee>(new EmpComparator());
		

		Employee e3 = new Employee();
		e3.adress="Fremont";
		e3.id=10;
		e3.name="Patel";
		
		
		
		Employee e1 = new Employee();
		e1.adress="Fremont";
		e1.id=20;
		e1.name="sanu";
		
		Employee e2 = new Employee();
		e2.adress="Fremont";
		e2.id=100;
		e2.name="Sanita";
		
		queue.add(e3);
		queue.add(e1);
		queue.add(e2);
		
		
		System.out.println("befor::"+queue.size());
		System.out.println(queue.peek().name);
		System.out.println("after::"+queue.size());
		
		Iterator<Employee> itr = queue.iterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next().name);
		}
		
	}
	
	public void stack(){
		
		//last in first out
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.add(78);
		stack.add(787);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
	public static void main(String[] args) {
		QueueExample qe = new QueueExample();
		qe.stack();

	}

}
