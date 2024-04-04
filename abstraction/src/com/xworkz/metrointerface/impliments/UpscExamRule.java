package com.xworkz.metrointerface.impliments;

import com.xworkz.metrointerface.ExamRule;

public class UpscExamRule implements ExamRule
{

	@Override
	public boolean hallTicket() 
	{
		System.out.println("implimentation,hallticket");
		return true;
	}

	@Override
	public boolean invigilator()
	{
		System.out.println("implimentation,invigilator");	
		return false;
	}

	@Override
	public double duration() 
	{
		System.out.println("implimentation,duration");	
		return 3.00;
	}

	@Override
	public String getName()
	{
		
		return ExamRule.NAME;
	}
	

}
