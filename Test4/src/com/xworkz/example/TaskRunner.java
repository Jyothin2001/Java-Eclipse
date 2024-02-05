package com.xworkz.example;

import com.xworkz.example.things.CanonPrinter;
import com.xworkz.example.things.Printer;
import com.xworkz.example.things.SmartCanonPrinter;

public class TaskRunner {

	public static void main(String[] args) 
	{
		Printer print=new Printer();
		print.print();
		print.scan();
		print.copy();
  
		System.out.println("-------------------------");
		
		
		CanonPrinter canon=new CanonPrinter();
		canon.print();
		canon.scan();
		canon.copy();
		canon.connectToWifi();
		
		
		
		Printer pin=new CanonPrinter();  //possible way,subclass = same type+parent type
		
		CanonPrinter pin1=(CanonPrinter)pin;  //data type casting
		pin1.print();
		pin1.scan();
		pin1.copy();
		pin1.connectToWifi();
		
		
        System.out.println("-------------------------");
		
		SmartCanonPrinter smart=new SmartCanonPrinter(); //1st way
		smart.print();
		smart.scan();
		smart.copy();
		smart.connectToWifi();
		smart.connectToMobile();
		
		System.out.println("-------------------------");
		
		CanonPrinter smart1=new SmartCanonPrinter();  //2nd way
		smart1.print();
		smart1.scan();
		smart1.copy();
		smart1.connectToWifi();
		//smart1.connectToMobile();
		
		System.out.println("-------------------------");
		
		SmartCanonPrinter can= (SmartCanonPrinter)smart1;  //data type casting
		can.connectToMobile();
		
		System.out.println("-------------------------");
		
		Printer smart2=new SmartCanonPrinter();  //3rd way
		print.print();
		print.scan();
		print.copy();
		//print.connectToMobile();
		//print.connectToMobile();
		
		System.out.println("-------------------------");
		
		SmartCanonPrinter smart3=(SmartCanonPrinter)smart2;
		smart3.connectToMobile();
		smart3.connectToWifi();
		

	}

}
