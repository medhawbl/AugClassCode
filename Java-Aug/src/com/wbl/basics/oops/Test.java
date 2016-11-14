package com.wbl.basics.oops;



public class Test {

	public static void main(String[] args) {
	
		
		QaTraining qa = new QaTraining();
		//qa.courseContent();
		if(qa instanceof Object){
			System.out.println("Yes it is object of qatraining");
		}else{
			System.out.println("no it is not object of qatraining");
		}
		qa.getRecordings();
		qa.lab();
		
		UItraining ui = new UItraining();
		ui.courseContent();
		ui.getRecordings();
		ui.lab();
	/*	//constructor initialsation 
		Adress ad = new Adress("3400 fremont0", 173);
		ad.getAdress();
		
		Adress ad1 = new Adress("3400 fremont0", 181);
		ad1.getAdress();
		
		//setter initialsation
		
		ad.setAdress("3400 fremont, 173");
		ad.setAdress("3400 fremont, 181");
		ad.getAdress();*/
	}

}
