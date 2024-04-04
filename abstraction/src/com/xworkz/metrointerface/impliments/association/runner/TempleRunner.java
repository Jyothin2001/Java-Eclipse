package com.xworkz.metrointerface.impliments.association.runner;

import com.xworkz.metrointerface.TempleRuleInterface;
import com.xworkz.metrointerface.impliments.IskonTempleRule;
import com.xworkz.metrointerface.impliments.association.TempleAdmin;

public class TempleRunner 
{

	public static void main(String[] args)
	{
		
		//IskonTempleRule iskon=new IskonTempleRule();
		//iskon.closeTime();
		
		TempleRuleInterface inter=new IskonTempleRule();
		//inter.closeTime();
				
		TempleAdmin temp=new TempleAdmin(inter);
		temp.specialEntry1();
		System.out.println("--------");
		
		temp.closeTime11();
		System.out.println("--------");
		
		temp.openTime1();
		System.out.println("--------");
		
		//temp.closeTime();
		temp.getName1();
		System.out.println("--------");

		//iskon.jj();
		
		
	}

}
