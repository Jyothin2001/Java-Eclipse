package com.xworkz.metrointerface.impliments.association.runner;

import com.xworkz.metrointerface.MetroRules;
import com.xworkz.metrointerface.impliments.BanashankariMetroRules;
import com.xworkz.metrointerface.impliments.association.MetroAdmin;

public class InterfaceRunner 
{

	@SuppressWarnings("null")
	public static void main(String[] args)
	{
		//MetroRules ref=new Metrorules();// can't create object for interface
		
		MetroRules metro=new BanashankariMetroRules();//it ]s become abstraction now.
		metro.buyTicket();//it has output????       *no output bcz its comes from metroRules interface*

		
		BanashankariMetroRules metro1=new BanashankariMetroRules();//its is not become abstraction 
		metro1.cleaniness();                                       //bcz we can get implementation part from this 
		                                                           //so hide that we use interface + implementation class.
		
		
		
		
		
		//MetroAdmin admin1=null;  //"nullpointerException" occurs when reference/variable is pointing to null
		//admin1.cleaniness(); // "nullpointerException   // rather than some memory location.
		
		MetroAdmin admin= new MetroAdmin(metro1);
		//admin.luggegeAndBuyticket1();
		admin.excessLuggege();//		
		
		//System.out.println(MetroRules.PURPLR_LINE);
		System.out.println(BanashankariMetroRules.GREEN_LINE);
		System.out.println(BanashankariMetroRules.YELLOW_LINE);
		
	}

}

//(parent instanceof child)
//child c =(parent)childref; //casting