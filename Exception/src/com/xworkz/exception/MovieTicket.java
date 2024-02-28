package com.xworkz.exception;

public class MovieTicket
{
	
   public void ticket(int ticketNo) throws TicketNoException
	{
		if(ticketNo>0 && ticketNo<5000)
		{
			System.out.println("yes! ticket number is valid");
		}
		
		else 
		{
			System.err.println("No! Ticket number is Invalid");	
			throw new TicketNoException("Invalid");
			
		}
		//System.out.println("after the catched exception");
	
	}
   public void jump()
   {
	   System.out.println("after  catched exception");
   }
}
