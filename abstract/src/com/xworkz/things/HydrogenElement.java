package com.xworkz.things;

public class HydrogenElement extends Element
{
   public HydrogenElement(char symbol,byte automicNumber,String name) 
   {
	super(symbol,automicNumber,name);
   }
	
	public HydrogenElement(byte automicNumber,char symbol) 
	{
		super(automicNumber,symbol);
	}
	@Override
	public void generateElectricity()
	{
		System.out.println("electricity");
	}
}


