package com.xworkz.methods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;


public class Methods {

	public static void main(String[] args) 
	{
		
		Collection<String> color= new ArrayList<String>();
		//Adding elements
		color.add("Blue");
		color.add("pink");
		color.add("Yellow");
		color.add("Red");
		color.add("Purple");
		color.add(null);
		color.add("Black");
		color.add(null);        //list can take multiple null elements
		color.add("Marron");
		color.add("Gray");
		color.add("Green");
		color.add("Green");
		
		//Access the elements/print
		for(String a:color)         //for(Data_type ref:collection_ref)->forEach loop
		{
			System.out.println("color is: "+a);
		}
		
		System.out.println("size is: "+color.size());
		
		System.out.println("-------------------------------------------");
		
		Collection<String> presidentName=new LinkedList<String>();
		presidentName.add("Rajendra prasad");
		presidentName.add("APJ Abdul Khalam");
		presidentName.add("droupadi murmu");
		presidentName.add("Vladimir putin");
		presidentName.add("Xi Jinping");

		for(String name:presidentName)
		{
			System.out.println("President Name: "+name);
		}
		System.out.println("size is: "+presidentName.size());
		
		System.out.println("-------------------------------------------");
		
		Collection<String> address=new ArrayList<String>();
		address.add("kR Puram");
		address.add("Tin Factory");
		address.add("Narayanapura");
		address.add("KR Puram RailwayStation");
		address.add("Emc");
		address.add("Mahadevapura");
		address.add("Rainbow Hospital");
		address.add("Karthik Nagar");
		address.add("Dodda Nakundi");
		address.add("Marathhalli");
		
		for(String a:address)  //Iteration continuous till end of an element
		{
			System.out.println("Address is: "+a);

		}

		System.out.println("size is: "+address.size());
		
		
	}

}
