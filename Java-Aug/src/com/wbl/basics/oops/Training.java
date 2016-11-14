package com.wbl.basics.oops;

import java.io.IOException;

public class Training {
	
	 String assignments;
	
	 String recordings;
	 
	 String instructors;
	 
	 String labEquipment;
	 
	 String courseContent;
	
	 int students;
	 
	 String studyMaterial;
	 
	 public Training(){
		 System.out.println("this is parent class- training");
	 }
	 public Training(String greet) {
		 System.out.println("this is parent class- training");
	 }
	 
	 public String getRecordings(){
		 System.out.println("you have access to recordings");
		 return "recordings";
	 }
	
	 //all child classes shud definitely implement this method
	 protected void courseContent(){
		 
	 }
	

	public void lab(){
		System.out.println("lab equipment is ready");
	}
	
	public Mobile  getObject(){
		System.out.println("jhello");
		return new Mobile();
	}
	
     public void test(){
		 
		 getRecordings();
		 lab();
		// super.courseContent();
	 }
	
	
	
	
	
	
		
	/*public boolean isStudentEnrolled(int id){
		
		System.out.println("total students enrolled:"+students);
		//to-do: db - connection - verify the record
		boolean isPresentInDB = true;
		
		if(isPresentInDB){
			return true;
		}else{
			return false;
		}
		
	}
*/


}
