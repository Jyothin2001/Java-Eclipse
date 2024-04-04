package com.xworkz.things;

public class Animal  implements Runnable
{
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
    System.out.println("hello  "+ Thread.currentThread().getName()+"  and "+Thread.currentThread().getId());
		}
	}
	
//	public Animal(String a)
//	{
//		super(a);
//	}
}
