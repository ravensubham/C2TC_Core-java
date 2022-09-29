package com.acharya.exeception;
import java.io.FileInputStream;

import java.io.FileNotFoundException;

public class Coding4

{

public void checkFileNotFound()

{

try

{

FileInputStream in = new FileInputStream("input.txt");

System.out.println("This is not printed");

}

catch (Exception fileNotFoundException)

{

System.out.println(fileNotFoundException+"file not found exception");

}

}

public static void main(String[] args)

{

Coding4 example = new Coding4();

example.checkFileNotFound();

} }