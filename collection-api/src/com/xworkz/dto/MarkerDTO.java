package com.xworkz.dto;

import java.io.Serializable;
import java.util.LinkedList;

public class MarkerDTO implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String brand;
	private String color;
	private int price;
	private int size;
	
	
	public MarkerDTO()
	{
		System.out.println("no args constructor");
	}
	
	public MarkerDTO(String brand, String color, int price, int size) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.size = size;
	}
	
	public static LinkedList<MarkerDTO> marker()
	{
		LinkedList<MarkerDTO> collection=new LinkedList<MarkerDTO>();
		
		MarkerDTO marker=new MarkerDTO("Sharpie", "Black", 2, 5);
		MarkerDTO marker1=new MarkerDTO("Copic", "Red", 4, 7);
		MarkerDTO marker2=new MarkerDTO("Pilot", "Blue", 3, 6);
		MarkerDTO marker3=new MarkerDTO("Expo", "Green", 1, 4);
		MarkerDTO marker4=new MarkerDTO("Prismacolor", "Yellow", 5, 8);
		MarkerDTO marker5=new MarkerDTO("Zebra", "Purple", 2, 5);
		MarkerDTO marker6=new MarkerDTO("Staedtler", "Orange", 3, 6);
		MarkerDTO marker7=new MarkerDTO("Faber-Castell", "Pink", 4, 7);
		MarkerDTO marker8=new MarkerDTO("Sakura", "Brown", 2, 5);
		MarkerDTO marker9=new MarkerDTO("Uni-ball", "Gray", 3, 6);
		
		collection.add(marker9);
		collection.add(marker8);
		collection.add(marker7);
		collection.add(marker6);
		collection.add(marker5);
		collection.add(marker4);
		collection.add(marker3);
		collection.add(marker2);
		collection.add(marker1);
		collection.add(marker);

		return collection;
		
	}
	@Override
	public String toString() {
		return "MarkerDTO [brand=" + brand + ", color=" + color + ", price=" + price + ", size=" + size + "]";
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

}
