package com.xworkz.runner;

import java.util.Collection;
import java.util.Iterator;

import com.xworkz.methods.Temperature;

public class TemaperatureRunner 
{

	public static void main(String[] args)
	{
		Collection<Double> temp= Temperature.getTemparature();
		
		for(Double a:temp)
		{
			if(a>20.5)
				System.out.println("Temperature greater than 20 is: "+a);
			
			
			if(a<20)
				System.out.println("Temperature less than 20 is: "+a);
			
		}
		
		
//		for(Double a:temp)
//		{
//			if(a>15)
//				temp.remove(a);
//		
//		}
//		Exception in thread "main" "java.util.ConcurrentModificationException" so use iterator method
		Iterator<Double> temp1=temp.iterator();
				
		while(temp1.hasNext())
		{
			
			Double a=temp1.next();
			
			if(a<15)
			{
                 temp1.remove();
             
				System.out.println(a);
				
			}
			//System.out.println(temp1);//hashcode
			
			
			
		}
		System.out.println("size is: "+temp.size());
		}
	}


