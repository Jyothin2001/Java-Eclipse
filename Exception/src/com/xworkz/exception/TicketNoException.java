package com.xworkz.exception;

public class TicketNoException extends Exception
{

	
	private static final long serialVersionUID = 1L;
	
	public TicketNoException(String msg)
	{
		
		super(msg);
		System.out.println("not available");
	}

}