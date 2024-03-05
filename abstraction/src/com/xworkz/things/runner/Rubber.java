package com.xworkz.things.runner;

import com.xworkz.things.HydrogenElement;
import com.xworkz.things.Son;
import com.xworkz.things.DcMotor;
import com.xworkz.things.Element;
import com.xworkz.things.Father;
import com.xworkz.things.Gown;

public class Rubber 
{
public static void main(String[] args) 
	{
	    HydrogenElement ele=new HydrogenElement('H',(byte)1,"hydrogen");
		System.out.println(ele.automicNumber);
		System.out.println(ele.name);
		System.out.println(ele.symbol);
		
		Element ele1=new HydrogenElement((byte)1,'H');
		System.out.println(ele1.automicNumber);
		System.out.println(ele1.symbol);
		
		
		ele.generateElectricity();
		
		
		
		
		
//	 Father father=new Father();
//	 father.eat();
//	 
		
		
		
	 Son son=new Son();
	 son.sleep();
	 son.eat();
	 
	 
	 
	 DcMotor dc=new DcMotor();
	 dc.start();
	 dc.stop();
	 
	 
	 
	 
	 Gown gwon=new Gown();
	 gwon.warmth();
	
	}

}
