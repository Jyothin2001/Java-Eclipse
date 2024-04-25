package com.xworkz.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class HouseDTO implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String Name;
	private int Number;
	private String area;
	private int rooms;
	
	public HouseDTO()
	{
		System.out.println("no-args constructor");
	}
	
	public HouseDTO(String name, int number, String area, int rooms) 
	{
		super();
		this.Name = name;
		this.Number = number;
		this.area = area;
		this.rooms = rooms;
	}
	
	
	public static Collection<HouseDTO> getHouseNumber()
	{
		Collection<HouseDTO> number=new ArrayList<HouseDTO>();
         
		HouseDTO house=new HouseDTO("Brundavana",101,"kr puram",2);
		HouseDTO house1=new HouseDTO("prathibha",102,"hoskote",4);
		HouseDTO house2=new HouseDTO("kavya",103,"tinfactory",2);
		HouseDTO house3=new HouseDTO("Ullasamma",104,"kr puram",6);
		HouseDTO house4=new HouseDTO("Rajkumar",105,"Rajajinagar",2);
		HouseDTO house5=new HouseDTO("Namnjudappa",106,"Nisarga layout",2);
		HouseDTO house6=new HouseDTO("Venkateshwara",107,"kr puram",4);
		HouseDTO house7=new HouseDTO("Krishna",108,"kr puram",2);
		HouseDTO house8=new HouseDTO("Eshwara",109,"Ramurtynagara",1);
		HouseDTO house9=new HouseDTO("ganesha",110,"Hebbala",3);
		
     	number.add(house);//pass the references
		number.add(house1);
		number.add(house2);
		number.add(house3);
		number.add(house4);
		number.add(house5);
		number.add(house6);
		number.add(house7);
		number.add(house8);
		number.add(house9);
		
		
		return number;
		
	}
	
	@Override
	public String toString()
	{
		return "HouseDTO [Name=" + Name + ", Number=" + Number + ", area=" + area + ", rooms=" + rooms + "]";
	}
	
	
	public String getName() 
	{
		return Name;
	}
	public void setName(String name) 
	{
		Name = name;
	}
	
	
	public int getNumber() 
	{
		return Number;
	}
	public void setNumber(int number) 
	{
		Number = number;
	}
	
	public String getArea()
	{
		return area;
	}
	public void setArea(String area) 
	{
		this.area = area;
	}
	
	public int getRooms() 
	{
		return rooms;
	}
	public void setRooms(int rooms)
	{
		this.rooms = rooms;
	}
	

}
