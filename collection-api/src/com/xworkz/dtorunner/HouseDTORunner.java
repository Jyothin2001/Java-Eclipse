package com.xworkz.dtorunner;

import java.util.Collection;

import com.xworkz.dto.HouseDTO;

public class HouseDTORunner 
{
public static void main(String[] args)
{
	Collection<HouseDTO> number=HouseDTO.getHouseNumber();
	
	for(HouseDTO a:number)
	{
		System.out.println(a); //we get Fully Qualified name.
		                       //because we pass the references of houseDTO in collection
		                       //to make understand output override toString()
	}
	
	HouseDTO num=new HouseDTO(); //via getter and setter methods
	
	num.setName("raj");
	System.out.println(num.getName());
	
}


}
