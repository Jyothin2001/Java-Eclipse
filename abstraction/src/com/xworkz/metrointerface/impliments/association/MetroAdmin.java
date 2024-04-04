package com.xworkz.metrointerface.impliments.association;

import com.xworkz.metrointerface.MetroRules;
import com.xworkz.metrointerface.impliments.BanashankariMetroRules;

public class MetroAdmin extends BanashankariMetroRules//abstraction ==this method did not know implimentation part there in banshanakarimetrorules class
{
        
	private MetroRules metrorule;//you need getter and setter methods

         
         //param constructor
	public MetroAdmin(MetroRules metrorule)
	{
		this.metrorule=metrorule;//used to initialize variables
		
	}
	
	
	
	public void luggegeAndBuyticket()
	{
		if(metrorule!=null)
		{
			
			boolean clean=metrorule.cleaniness();
			boolean luggege=metrorule.excessLuggege();
			
			if(clean && luggege)
			{
		
			System.out.println("yes!");
		    }
		     else 

		     {	
               System.out.println("No!");
			  }
		}
		else 
		{
			System.out.println("null");
		}
		
	}
		public void luggegeAndBuyticket1()
		{
			if(metrorule!=null)
			{
				
				boolean clean=metrorule.cleaniness();
				//boolean luggege=metrorule.excessLuggege();
				
					
			
				System.out.println("yes! " +clean);
			    }
			     else 

			     {	
	               System.out.println("No!");
				  }
			
		}

		
			
				
		//or 
			
//	      if(metrorule.cleaniness() && metrorule.excessLuggege())//boolean and boolean erbeku
//			{
//				System.out.println("yes! methods are there");
//			}
//			else 
//			{
//				System.out.println("No! methods are not there");
//			}
		
//			if(metrorule.getLine() && metrorule.getLine1())
//			{
//				System.out.println("yes! methods are there colors ");
//			}
//			else 
//			{
//				System.out.println("No! methods are not there colors");
//			}	
//			}
		
	
}
	
	
	
