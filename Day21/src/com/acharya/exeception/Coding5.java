package com.acharya.exeception;

	import java.util.*;

	public class Coding5

	{

	public static void main(String args[])

	{

	Coding5 ob = new Coding5();

	try

	{

	ob.meth1();

	}

	catch(Exception e)

	{

	System.out.println("ArithmaticExceptionthrown by meth1() method is caught inmain()method");

	}

	}
	
	public void meth1()

	{

	try

	{

	System.out.println(100/0);

	}

	catch(ArithmeticException nullExp)

	{

	System.out.println("We have an Exception- "+nullExp);

	}

	System.out.println("Outside try-catchblock");

	}}