package com.xworkz.things;

public class Dog extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
    System.out.println("hi  "+ Thread.currentThread().getName()+"and "+Thread.currentThread().getId());
		}
	}
	
	
}
