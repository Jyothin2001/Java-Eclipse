package com.xworkz.stream;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class BrushDTO implements Serializable,Comparable<BrushDTO>
{
	private static final long serialVersionUID = 1L;
	
	private String brandName;
	private int price;
	private String material;
	private String type;
	
	
	
	public BrushDTO()
	{
		System.out.println("no arg constructor");
	}

	public BrushDTO(String brandName, int price, String material, String type) 
	{
		super();
		this.brandName=brandName;
		this.price = price;
		this.material = material;
		this.type = type;
	}
public static Collection<BrushDTO> brush()
{
	Collection<BrushDTO> collection=new ArrayList<BrushDTO>();
	

	BrushDTO brush1=new BrushDTO("ABC Brushes", 150, "Nylon", "Round");
	BrushDTO brush2=new BrushDTO("XYZ Art Supplies", 60, "Synthetic", "Flat");
	BrushDTO brush3=new BrushDTO("Artisan Brushes", 250, "Sable", "Angular");
	BrushDTO brush4=new BrushDTO("Crafty Creations", 60, "Bristle", "Fan");
	BrushDTO brush5=new BrushDTO("Masterpiece Brushes", 10, "Hog Hair", "Detail");
	BrushDTO brush6=new BrushDTO("Fine Arts Depot", 18, "Camel Hair", "Filbert");
	BrushDTO brush7=new BrushDTO("Painters' Paradise", 22, "Horsehair", "Mop");
	BrushDTO brush8=new BrushDTO("Brush Express", 12, "Taklon", "Shader");
	BrushDTO brush9=new BrushDTO("Artisanal Tools", 28, "Badger Hair", "Comb");
	BrushDTO brush10=new BrushDTO("Palette Picks", 16, "Ox Hair", "Rigger");

	collection.add(brush10);
	collection.add(brush9);
	collection.add(brush8);
	collection.add(brush7);
	collection.add(brush6);
	collection.add(brush5);
	collection.add(brush4);
	collection.add(brush3);
	collection.add(brush2);
	collection.add(brush1);
	
	return collection;
	
	
}
@Override
public int compareTo(BrushDTO o) 
{
	if(this.price==o.price)
	     return 0;
	else if(this.price>o.price)
		return 100;  //+ve value
	else
		return -10;

}



	@Override
	public String toString()
	{
		return "BrushDTO[brand=" + brandName + ", price=" + price + ", material=" + material + ", type=" + type + "]";
	}

	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public void setBrand(String brandName)
	{
            this.brandName=brandName;
	}
	public String getName()
	{
		return brandName;
	}

			
	

}
