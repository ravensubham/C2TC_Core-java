package com.acharya.exeception;

public class Coding2 {
	public static void main(String args[]) {
		try {
			int a,b;
			b=0;
			a=10/b;
			System.out.println("under try part process");
		}
		catch(Exception e){
			System.out.println(e);	
		}
	}

}
