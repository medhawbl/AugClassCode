package com.wbl.abstractAndInterface;



public  abstract class Training extends Quiz{
	
	 public String assignments;
	
	 String recordings;
	 
	 String courseContent;
	
	 
	 public Training(){
		 System.out.println("this is abstarct class- training");
	 }
	 
	 public void displayAdress(){
		 System.out.println("fremont,dublin");
	 }
	 public void getRecordings(){
		 System.out.println("upload and give acces to recordings");
	 }
	 
	 protected abstract String courseContent();
	 


}
