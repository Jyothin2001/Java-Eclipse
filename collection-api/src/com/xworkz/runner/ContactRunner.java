package com.xworkz.runner;

import java.util.Collection;

import com.xworkz.methods.ContactNumber;

public class ContactRunner 
{
	public static void main(String[] args) 
	{
		Collection<Long> num=ContactNumber.numbers();
		
		for(Long a:num)
		{
			System.out.println(a);
			System.out.println(num.size());
		}
		
	}

}
