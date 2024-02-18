package com.xworkz.things.example;

public class Shoe
{
	public int startedYear;
	public String country;
	public String brand;
	public String color;
	public int size;
	public String laceColor;
	
	public Shoe()
	 {
		  System.out.println("no argument Shoe");
	 }
	
	@Override
	public String toString() 
	{
		
		return "startedYear:" +this.startedYear + "    ,country: "+this.country + "     ,brandValue: "+this.brand + ",      color: "+this.color +",  size: "+this.size+"   laceColor:"+this.laceColor;
	}

	
	@Override
	public boolean equals(Object obj) 
	{

		
		if(obj!=null&&obj instanceof Shoe)
		{
			
			Shoe shoe4=(Shoe)obj;
			
			if(this.country.equals(shoe4.country) && this.startedYear== shoe4.startedYear && this.brand.equals(shoe4.brand))
			{
				System.out.println("equals in:"+obj);
				System.out.println("Shoe are same ");
				return true;
			}
		}
		System.out.println("not same");
		return false;
	}

}
