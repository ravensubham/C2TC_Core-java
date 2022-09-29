package com.acharya.exeception;

public class Coding3 {
	public static void main(String args[]) {
		try {
			int i,sum;
			sum=9;
			for(i=-1;i<3;++i) {
				sum=(sum/i);
				System.out.println("under try process");
			}}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}


