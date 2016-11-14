package com.wbl.collections;

import java.util.Comparator;

public class EmpComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		String i1 = o1.name;
		String i2 = o2.name;
		return i1.compareTo(i2);
	}

	
	 
}
