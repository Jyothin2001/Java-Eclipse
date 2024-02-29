package com.xworkz.exception.things;

import com.xworkz.exception.CocaColaMultipleException;
import com.xworkz.exception.NumberException;

public class CocaColaRunner1 
{
	public static void main(String[] args) 
	{
		
     CocaColaMultipleException cola=new CocaColaMultipleException();
	
	try
	{
	cola.drink(10000);
	
	}
			catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(" array catch: "+ae.getMessage());
		} 
		
		catch (NumberException e) 
		{
			
			//e.printStackTrace();
			System.err.println(" own exception catch: "+e.toString());
		}
	    cola.run(); //executed

	}

}
