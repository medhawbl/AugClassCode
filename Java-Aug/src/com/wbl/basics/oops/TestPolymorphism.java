package com.wbl.basics.oops;

public class TestPolymorphism {

	public static void main(String[] args) {
		//poylmorphism w.r.to reference var's
		Training qa = new QaTraining();
		qa.test();
		//QaTraining qa1 = qa;
	    Training qa2 = qa;
		//polymorphism w.r.to method overriding
		qa.courseContent();
		qa.getObject();
		
		Sum s = new Sum();
		s.performSum(4, 5);

	}
	
	public void test(){
		//animal - dog-- dog is a animal, not true --  animal is a dog
		Mobile m = new IOS();
		//m.printDetails();
	}

}
