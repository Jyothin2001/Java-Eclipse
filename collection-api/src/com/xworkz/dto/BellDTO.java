package com.xworkz.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class BellDTO implements Serializable
{
	private static final long serialVersionUID = 1L;
	 
	private String metalUsed;
	private String type;
	private int  weight;
	private int width;
	private int  height;
	private float price;
	
	public BellDTO()
	{
		System.out.println("no arg constructor");
	}
	
	public BellDTO(String metalUsed, String type, int weight, int width, int height, float price) 
	{
		super();
		this.metalUsed=metalUsed;
		this.type = type;
		this.weight = weight;
		this.width = width;
		this.height = height;
		this.price = price;
	}

	public static Collection<BellDTO> bell()
	{
		Collection<BellDTO> collection=new ArrayList<BellDTO>();
		
		BellDTO bell1 = new BellDTO("Bronze", "Handbell", 500, 10, 500, 1000.99f);
		BellDTO bell2 = new BellDTO("Silver", "Churchbell", 1000, 20, 30, 99.99f);
		BellDTO bell3 = new BellDTO("Gold", "Sleigh Bell", 500, 5, 15, 49.1200f);
		BellDTO bell4 = new BellDTO("Brass", "Dinner Bell", 700, 15, 700, 1500.99f);
		BellDTO bell5 = new BellDTO("Copper", "School Bell", 300, 12, 20, 2000.99f);
		BellDTO bell6 = new BellDTO("Iron", "Temple Bell", 1500, 25, 40, 149.99f);
		BellDTO bell7 = new BellDTO("Steel", "Ship Bell", 1200, 22, 35, 79.99f);
		BellDTO bell8 = new BellDTO("Aluminum", "Garden Bell", 400, 8, 12, 19.99f);
		BellDTO bell9 = new BellDTO("Titanium", "Wind Chime", 600, 18, 28, 69.99f);
		BellDTO bell10 = new BellDTO("Bronze", "Crystal Bell", 800, 17, 27, 129.99f);

		collection.add(bell10);
        collection.add(bell9);
        collection.add(bell8);
        collection.add(bell7);
        collection.add(bell6);
        collection.add(bell5);
        collection.add(bell4);
        collection.add(bell3);
        collection.add(bell2);
        collection.add(bell1);
		
		return collection;
		
	}
	
	@Override
	public String toString() 
	{
		return "BellDTO [metalUsed=" + metalUsed + ", type=" + type + ", weight=" + weight + ", width=" + width
				+ ", height=" + height + ", price=" + price  + "]";
	}

	public String getMetal() 
	{
		return metalUsed;
	}
     public void setMetal(String metalUsed) 
	{
		this.metalUsed = metalUsed;
	}
	
	public void setType(String type)
	{
		this.type=type;
	}
	
	public String setType()
	{
		return type;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}


	
	

}
