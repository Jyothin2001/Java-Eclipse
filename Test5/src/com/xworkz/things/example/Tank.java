package com.xworkz.things.example;

public class Tank 
{

	public void run(Handwash hand1)
	{
	

		if(hand1 instanceof Sanitizer)  
		{
			Sanitizer sani2=(Sanitizer)hand1;
			System.out.println("method: sanitizer : " + sani2.quantity);
			sani2.disinfect();
			
			System.out.println("method: sanitizer : " + sani2.aroma);
			sani2.clean();
			
		
		}
		 if(hand1 instanceof Soap)
		{
		    Soap soap4=(Soap)hand1;
			//soap4.price=120;  
		    System.out.println("method: soap : " + soap4.price);
		    soap4.foam();
		    soap4.clean(); //via sub class reference get the members of parent 
		    hand1.clean();
		    
		    
		}
		 if(hand1 instanceof Lux)
		{
			Lux lux2=(Lux)hand1;
			lux2.manufacturingDate=2024; //Lux =sub class
			System.out.println("method1: " + lux2.manufacturingDate);
			lux2.makeYoung();
			
			lux2.foam(); // soap=parent of lux
			System.out.println("method: " + lux2.price);
			
			lux2.clean(); //handwash= grand parent of lux
			System.out.println("method1: " + lux2.aroma);
			
			
		}
		
		
	}
	
}
