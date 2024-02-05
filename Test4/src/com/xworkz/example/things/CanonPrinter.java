package com.xworkz.example.things;

public class CanonPrinter extends Printer
{
	
	public CanonPrinter()
	{
		System.out.println("sub class : default constructor");
	}
	
	public void print()
	{
		System.out.println("sub class : print");
	}
	
	
	public void scan()
	{
		System.out.println("sub class : scan");
	}

	public void copy()
	{
		System.out.println("sub class : print");
	}

	public void connectToWifi()
	{
		System.out.println("sub class : wifi");
	}


}
