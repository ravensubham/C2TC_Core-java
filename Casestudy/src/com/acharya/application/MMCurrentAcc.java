package com.acharya.application;

import com.acharya.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{

	
	
	// TODO Auto-generated constructor stub
public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}



public void  withdraw(float creditLimit) {
	System.out.println(" dear account holder your account bal"+ getAccBal()+" the minimuun Balance Required is"+creditLimit);

	 
	 
 }
 



@Override
public String toString() {
	return "MMCurrentAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + "]";
}

 
}
