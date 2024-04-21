package com.xworkz.ass;

public class FestivalCheck {

	private Festival festival;//when we do association we can inherit the members of interface or class
	
	public FestivalCheck(Festival fest)
	{
		this.festival=fest;
	}
	
	public void check()
	{
		System.out.println("check method");
		boolean value=this.festival.prepare("sweet", "flower");
		if(value)
		{
			System.out.println("prepared");
		}
		else
		{
			System.out.println("not prepared");
		}
		
		
	}
}
