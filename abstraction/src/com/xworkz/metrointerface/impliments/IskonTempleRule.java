package com.xworkz.metrointerface.impliments;

import com.xworkz.metrointerface.TempleRuleInterface;

//implementation
public  class IskonTempleRule  implements TempleRuleInterface
{

	@Override
	public double openTime()
	{
		System.out.println("impli, open time: ");
		return 9.00;
	}
	
	@Override
	public double closeTime()
	{
		System.out.println("impli,close time: ");
		return 8.30;
		
	}
	
	@Override
	public double specialEntry()
	{
		System.out.println("impli,special entry: ");
		return 11.45;
	}
	
	@Override
	public String getName()
	{
		System.out.println("impli,Name of the Temple : "+TempleRuleInterface.NAME);
		return TempleRuleInterface.NAME;
		
	}
	public void jj()
	{
		getName();
	}
	
	
	
}
