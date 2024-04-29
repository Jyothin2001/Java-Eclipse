package com.xworkz.stream;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class RubberDTO implements Serializable,Comparable<RubberDTO>
{
	private static final long serialVersionUID = 1L;
	
	private String brandname;
	private String color;
	private char shape;
	private LocalDate manuDate;
	
	public RubberDTO() 
	{
		System.out.println("no arg");
	}
	
	
	public RubberDTO(String brandname, String color, char shape, LocalDate manuDate) 
	{
		super();
		this.brandname = brandname;
		this.color = color;
		this.shape = shape;
		this.manuDate = manuDate;
	}
	public static Collection<RubberDTO> rubber()
	{
		Collection<RubberDTO> c=new ArrayList<RubberDTO>();
		
		RubberDTO rubber1=new RubberDTO("ABC", "Red", 'S', LocalDate.of(2023, 5, 15));
		RubberDTO rubber2=new RubberDTO("MRF Tyres", "Blue", 'C', LocalDate.of(2022, 10, 28));
		RubberDTO rubber3=new RubberDTO("PolyPlex", "Green", 'R', LocalDate.of(2024, 2, 10));
		RubberDTO rubber4=new RubberDTO("Alpha", "Yellow", 'O', LocalDate.of(2023, 8, 7));
		RubberDTO rubber5=new RubberDTO("maxxis Rubber", "Black", 'T', LocalDate.of(2022, 12, 18));
		RubberDTO rubber6=new RubberDTO("JK Tyres", "White", 'D', LocalDate.of(2024, 6, 22));
		RubberDTO rubber7=new RubberDTO("Sintex Bapl", "Orange", 'E', LocalDate.of(2023, 3, 3));
		RubberDTO rubber8=new RubberDTO("Roopa Polymers", "Purple", 'H', LocalDate.of(2022, 9, 14));
		RubberDTO rubber9=new RubberDTO("KBL", "Pink", 'F', LocalDate.of(2024, 11, 30));
		RubberDTO rubber10=new RubberDTO("LMN", "Brown", 'G', LocalDate.of(2023, 4, 25));
		RubberDTO rubber11=new RubberDTO("abb", "Brown", 'G', LocalDate.of(2023, 4, 25));
		RubberDTO rubber12=new RubberDTO("abc", "Brown", 'G', LocalDate.of(2023, 4, 25));
		
         c.add(rubber10); 
         c.add(rubber9);
         c.add(rubber8);
         c.add(rubber7);
         c.add(rubber6);
         c.add(rubber5);
         c.add(rubber4);
         c.add(rubber3);
         c.add(rubber2);
         c.add(rubber1);
         c.add(rubber11);
         c.add(rubber12);
		
		return c;
	}
	
	
	
	@Override
	public String toString()
	{
		return "RubberDTO [brandname=" + brandname + ", color=" + color + ", shape=" + shape + ", manuDate=" + manuDate
				+ "]";
	}
	@Override
	public int compareTo(RubberDTO o)
	{
		return o.brandname.compareToIgnoreCase(this.brandname);
	}
	

	public String getBrandname() {
		return brandname;
	}


	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public char getShape() {
		return shape;
	}


	public void setShape(char shape) {
		this.shape = shape;
	}


	public LocalDate getManuDate() {
		return manuDate;
	}


	public void setManuDate(LocalDate manuDate) {
		this.manuDate = manuDate;
	}


	
	

}
