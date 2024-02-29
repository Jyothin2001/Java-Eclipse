package com.xworkz.exception;

public class CocaColaMultipleException 
{
	int num=0;
	public void drink(int num) throws NumberException,ArrayIndexOutOfBoundsException
	{
		int arr[]= {1,2,3,4};
		System.out.println("index: "+arr[5]);
		
		if(num>=1000)
		{
			System.out.println("Valid number : " +num);
		}
		else
		{
			System.out.println("Invalid number : " +num);
			throw new NumberException("give number grater than 1000");
		}
		//System.out.println("after 1 exception");//both exception works fine then onlu=y this line executes
		
	}
	
	public void run()  //method execute any one exception works 
	{
		System.out.println("after exception");
	}
}
