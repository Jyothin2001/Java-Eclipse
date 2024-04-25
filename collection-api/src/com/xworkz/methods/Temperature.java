package com.xworkz.methods;

import java.util.ArrayList;
import java.util.Collection;

public class Temperature
{

	public static Collection<Double> getTemparature()
	{
		Collection<Double> temp=new ArrayList<Double>();
		
		temp.add(22.5);
		temp.add(23.5);
		temp.add(24.5);
		temp.add(26.5);
		temp.add(16.5);
		temp.add(12.5);
		temp.add(20.5);
		temp.add(14.5);
		temp.add(13.5);
		temp.add(11.5);

		
		return temp;
	}
}
