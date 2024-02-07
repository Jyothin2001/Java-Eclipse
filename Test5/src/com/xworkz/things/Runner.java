package com.xworkz.things;

import com.xworkz.things.example.Handwash;
import com.xworkz.things.example.Lux;
import com.xworkz.things.example.Sanitizer;
import com.xworkz.things.example.Soap;
import com.xworkz.things.example.Tank;

public class Runner
{

	public static void main(String[] args) 
	{
		Tank tank=new Tank();
		
		
		Handwash hand=new Handwash();  //...
		hand.clean();
		System.out.println("handwash :"+hand.aroma);
		
		
		Sanitizer sani =new Sanitizer(); //...
		sani.quantity=789;
		System.out.println("sanitizer :"+sani.quantity);
		sani.disinfect();
		
		
		System.out.println("====================");
		Handwash handwash =new Sanitizer();
		tank.run(handwash);
		System.out.println("====================");
		
		
		
        Soap soap  =new Soap(); //....
        //soap.price=(short)430;  
        System.out.println("soap :"+soap.price);
        soap.foam();
        
        System.out.println("====================");
		Handwash handwash1=new Soap();
		tank.run(handwash1);
		System.out.println("====================");
		
		
		
			
		Lux lux=new Lux();  //....
		lux.manufacturingDate=2023;
		System.out.println("lux :"+lux.manufacturingDate);
		lux.makeYoung();
	
		
		System.out.println("====================");  //calling same 
		Soap soap1=new Lux();
		tank.run(soap1);
		soap1.foam();
		System.out.println("====================");
		
		
		Handwash hand2=new Lux();
		tank.run(hand2);
		System.out.println("====================");
		
		
		
		
		
		
		
		
		
		
	}

}
