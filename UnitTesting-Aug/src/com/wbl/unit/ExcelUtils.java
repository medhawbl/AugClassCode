package com.wbl.unit;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExcelUtils {

	
	public static Object[][] getexceldata() throws FileNotFoundException{
		FileReader rd = new FileReader("test.xls");
		//apache poi- xssfworkbook,rows,columns
		
		//set the data into Object array
		return null;
	}
}
