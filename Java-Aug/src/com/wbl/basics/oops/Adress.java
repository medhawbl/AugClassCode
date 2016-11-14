package com.wbl.basics.oops;

public class Adress {
	
	public String adress;
	
	
	//constructor initilsation
	public Adress(){
		adress = "";
	}

	public Adress(String street, int doorNo){
		adress = street + " " + doorNo;  
	}
	
	public Adress(String street, int doorNo, int phoneNumber){
		adress = street + " " + doorNo + " "+ phoneNumber;  
	}
	
	
	// gettter and setter initialsation
	
	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getAdress(){
		System.out.println("adress is "+ adress);
		return adress;
	}
}
