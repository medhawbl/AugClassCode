package com.wbl.collections;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

	
	public static void test(){
		Properties prop = new Properties();
		String fileName = "prop.properties";
		try {
			prop.load(new FileReader(fileName));
			
			System.out.println(prop.getProperty("street"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}

}
