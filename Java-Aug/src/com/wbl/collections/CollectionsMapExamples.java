package com.wbl.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionsMapExamples {

	public void hashMapExample(){
		Map<Employee,Integer> map = new HashMap<Employee,Integer>();
		Employee e1 = new Employee();
		e1.id=20;
		Employee e2 = new Employee();
		e2.id=30;
		map.put(e1, 30000);
		map.put(e2, 200);
		
		Employee e3 = new Employee();
		e3.id=20;
		
		/*Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		map.put(4, 30000);
		map.put(5, 200);*/
		
		
		System.out.println(map.get(e3));
		
		/*//iterate using keySet
		Set<Employee> keys = map.keySet();
		for(Employee key : keys){
			System.out.println("key::"+key +"::value::"+ map.get(key));
		}*/
		
	}
	
	public void treeMapExample(){
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
		map.put(179, 20);
		map.put(29879847, 200);
		map.put(35658, 20);
		//map.put(null, 4567);
		//iterating the maps using entryset
		Set<Map.Entry<Integer,Integer>> mapKeysValues  = map.entrySet();
		for(Map.Entry<Integer,Integer> keyVal:mapKeysValues){
		System.out.println("map key::"+keyVal.getKey()+"::map value::" + keyVal.getValue());
		}
		
		//iterate using keySet
		Set<Integer> keys = map.keySet();
		for(Integer key : keys){
			System.out.println("key::"+key +"::value::"+ map.get(key));
		}
		
	}
	
	public void treeMap(){
		Map<Employee, String> tset = new TreeMap<Employee,String>();
		Employee e1 = new Employee();
		e1.adress="Fremont";
		e1.id=1799;
		e1.name="Sanita";
		
		Employee e2 = new Employee();
		e2.adress="Fremont";
		e2.id=2;
		e2.name="Sanita";
		
		tset.put(e1,"Test1");
		tset.put(e2, "Test2");
		
		
		for(Employee emp : tset.keySet()){
			System.out.println(tset.get(emp));
		}
	}
	
	public static void main(String[] args) {
		
		CollectionsMapExamples cme = new CollectionsMapExamples();
		cme.hashMapExample();
	}

}
