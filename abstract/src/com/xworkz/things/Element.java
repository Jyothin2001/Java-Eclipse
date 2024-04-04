package com.xworkz.things;



public abstract class Element 
{
	   public char symbol;
	   public byte automicNumber;
	   public String name;
	   
	   public Element(char symbol,byte automicNumber,String name)
	   {
		   this.automicNumber=automicNumber;
		   this.name=name;
		   this.symbol=symbol;
	   }
	   
	   public Element(byte automicNumber,char symbol)
	   {
		   this.automicNumber=automicNumber;
		   this.symbol=symbol;
	   }
	   
	   
	   public abstract void generateElectricity(); //no body for method
	
}
