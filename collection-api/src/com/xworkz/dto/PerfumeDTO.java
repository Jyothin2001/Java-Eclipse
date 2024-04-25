package com.xworkz.dto;

import java.io.Serializable;
import java.util.ArrayList;


public class PerfumeDTO implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String brand;
	private String color;
	private int cost;
	private String fragrance;
	private int durationLast;
	
	public PerfumeDTO()
	{
		System.out.println("no arg constructor");
	}
	
	public PerfumeDTO(String brand, String color, int cost, String fragrance, int durationLast)
	{
		super();
		this.brand = brand;
		this.color = color;
		this.cost = cost;
		this.fragrance = fragrance;
		this.durationLast = durationLast;
	}

	public static ArrayList<PerfumeDTO> perfume()
	{
		ArrayList<PerfumeDTO> collection=new ArrayList<PerfumeDTO>();
		
		PerfumeDTO perfume=new PerfumeDTO("Gucci", "Pink", 100, "Floral", 8);
		PerfumeDTO perfume1=new PerfumeDTO("Chanel", "Clear", 100, "Citrus", 12);
		PerfumeDTO perfume2=new PerfumeDTO("Dior", "Gold", 80, "Woody", 10);
		PerfumeDTO perfume3=new PerfumeDTO("Versace", "Blue", 70, "Aquatic", 9);
		PerfumeDTO perfume4=new PerfumeDTO("Calvin Klein", "Silver", 60, "Fresh", 7);
		PerfumeDTO perfume5=new PerfumeDTO("Armani", "Black", 50, "Spicy", 11);
		PerfumeDTO perfume6=new PerfumeDTO("Prada", "White", 120, "Powdery", 15);
		PerfumeDTO perfume7=new PerfumeDTO("Yves Saint Laurent", "Red", 110, "Fruity", 13);
		PerfumeDTO perfume8=new PerfumeDTO("Burberry", "Green", 85, "Herbal", 14);
		PerfumeDTO perfume9=new PerfumeDTO("Hugo Boss", "Yellow", 65, "Citrus", 6);

		
		collection.add(perfume9);
		collection.add(perfume8);
		collection.add(perfume7);
		collection.add(perfume6);
		collection.add(perfume5);
		collection.add(perfume4);
		collection.add(perfume3);
		collection.add(perfume2);
		collection.add(perfume1);
		collection.add(perfume);
		
		return collection;
	}
	@Override
	public String toString() 
	{
		return "PerfumeDTO [brand=" + brand + ", color=" + color + ", cost=" + cost + ", fragrance=" + fragrance
				+ ", durationLast=" + durationLast + "]";
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getFragrance() {
		return fragrance;
	}

	public void setFragrance(String fragrance) {
		this.fragrance = fragrance;
	}

	public int getDurationLast() {
		return durationLast;
	}

	public void setDurationLast(int durationLast) {
		this.durationLast = durationLast;
	}

	

}
