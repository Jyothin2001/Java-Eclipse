package com.xworkz.exception.things;

import com.xworkz.exception.CocaColaMultipleException;
import com.xworkz.exception.NumberException;

public class CocaColaRunner {

	public static void main(String[] args) 
	{
		CocaColaMultipleException cola=new CocaColaMultipleException();
		
		try
		{
		cola.drink(10);
		
		}
		catch(ArrayIndexOutOfBoundsException  | NumberException ee)
	{
			System.out.println("catch: "+ee.getMessage());
			System.out.println("common exception");
	}
		
		
		
	}

}
