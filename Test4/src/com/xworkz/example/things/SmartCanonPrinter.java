package com.xworkz.example.things;

public class SmartCanonPrinter extends CanonPrinter
{
	
	public SmartCanonPrinter()
	{
		System.out.println(" smart sub1 class : default constructor");
	}
	
	public void print()
	{
		System.out.println("sub1 class : print");
	}
	
	
	public void scan()
	{
		System.out.println("sub1 class : scan");
	}

	public void copy()
	{
		System.out.println("sub class : print");
	}

	public void connectToWifi()
	{
		System.out.println("sub class : wifi");
	}
	
	public void connectToMobile()
	{
		System.out.println("sub class : mobile");
	}


}
