package com.acharya.application;


import com.acharya.framework.SavingAcc;
public class MMSavingAcc extends SavingAcc{
	
	private static final float MINBAL=1000.0f;
	
public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}


	

	public void withdraw(float MINBAL) {
		System.out.println(" Dear customer,your account bal in saving acc is "+ getAccBal()+"Dear Customer, Your minimum balance in saving account is: "+MINBAL);
		
	}




	@Override
	public String toString() {
		return "MMSavingAcc [isSalaried()=" + isSalaried() + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}




	public static float getMinbal() {
		return MINBAL;
	}




	

	
}
