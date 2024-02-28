package com.xworkz.exception.things;

import com.xworkz.exception.MovieTicket;
import com.xworkz.exception.TicketNoException;

public class Runner 
{

	public static void main(String[] args) 
	{
		MovieTicket ticket=new MovieTicket();
		
		try
		{
		
		//ticket.jump(); //it is excecuted
		ticket.ticket(5001);  //calling exception method
		
		}
		catch(TicketNoException k)
		{
			System.out.println("In catch block :"+k.getMessage());// k=FQN+msg(given by me)
		}
		ticket.jump();
	}

}
