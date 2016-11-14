package com.wbl.arraysAndStrings;

public class MyThread implements Runnable{

	@Override
	public void run() {
		Animal animal = new Animal();
		animal.makenoise();
		
	}

}
