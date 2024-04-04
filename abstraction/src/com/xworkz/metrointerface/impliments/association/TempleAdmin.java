package com.xworkz.metrointerface.impliments.association;

import com.xworkz.metrointerface.TempleRuleInterface;

//Association=calling interface  as instance variable type
public class TempleAdmin 
{
	private TempleRuleInterface rule;
	
	
	public TempleAdmin(TempleRuleInterface rule)
	{
		System.out.println("----temple Admin constructor----");
		this.rule=rule;
	}	
	
	public void openTime1()
	{
		
		if(rule!=null)
		{
			double open=rule.openTime();
			System.out.println("admin,open Time : "+open);
			
		}
		
	}
	
	public void closeTime11()
	{
		if(rule!=null)
		{
			
			System.out.println("admin,close Time : "+rule.closeTime());//direct access
			
		}
	}
	
	public void specialEntry1()
	{
		if(rule!=null)
		{
			
			double special=rule.specialEntry();
			System.out.println("admin,special entry : "+special);
			
		}
	}
	public void getName1()
	{
		if(rule!=null)
		{
			
			String name=rule.getName();
			System.out.println("admin,name : "+name);
			
		}
	}
	
	

}
