package com.xworkz.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class BoxDTO implements Serializable
{
	private static final long serialVersionUID = 1L;


  private String area;
  private String color;
  private int SerialNo;
  private String material;
  
  public BoxDTO()
  {
	  System.out.println("no arg constructor");
  }
  
public BoxDTO(String area, String color, int serialNo, String material) 
{
	super();
	this.area = area;
	this.color = color;
	SerialNo = serialNo;
	this.material = material;
}

public static Collection<BoxDTO> box()
{
	
	Collection<BoxDTO> collection=new ArrayList<BoxDTO>();
	
	BoxDTO box=new BoxDTO("Small", "Red", 12345, "Cardboard");
	BoxDTO box1=new BoxDTO("Medium", "Blue", 67890, "Plastic");
	BoxDTO box2=new BoxDTO("Large", "Green", 24680, "Wood");
	BoxDTO box3=new BoxDTO("Extra Large", "Green", 13579, "Metal");
	BoxDTO box4=new BoxDTO("Tiny", "Purple", 98765, "Glass");
	BoxDTO box5=new BoxDTO("Huge", "Red", 54321, "Foam");
	BoxDTO box6=new BoxDTO("Compact", "Red", 11223, "Fabric");
	BoxDTO box7=new BoxDTO("Gigantic", "White", 33445, "Ceramic");
	BoxDTO box8=new BoxDTO("Mini", "Brown", 55667, "Rubber");
	BoxDTO box9=new BoxDTO("Massive", "Gray", 77889, "Styrofoam");
	
	collection.add(box9);
	collection.add(box8);
	collection.add(box7);
	collection.add(box6);
	collection.add(box5);
	collection.add(box4);
	collection.add(box3);
	collection.add(box2);
	collection.add(box1);
	collection.add(box);

	return collection;
	
}
@Override
public String toString() 
{
	return "BoxDTO [area=" + area + ", color=" + color + ", SerialNo=" + SerialNo + ", material=" + material + "]";
}

public String getArea() {
	return area;
}

public void setArea(String area) {
	this.area = area;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public int getSerialNo() {
	return SerialNo;
}

public void setSerialNo(int serialNo) {
	SerialNo = serialNo;
}

public String getMaterial() {
	return material;
}

public void setMaterial(String material) {
	this.material = material;
}
  
  
}
