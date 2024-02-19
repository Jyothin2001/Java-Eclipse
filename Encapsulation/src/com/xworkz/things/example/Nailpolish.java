package com.xworkz.things.example;

public class Nailpolish 
{
	protected String color;
	protected String brand;
	protected double volume;
	protected String finish;
	protected double price;

	public Nailpolish()
	{
		System.out.println("no args Nailpolish");
	}
	
	
	


	@Override
	public String toString() 
	{
		return "Nailpolish color=" + color + ", brand=" + brand + ", volume=" + volume + ", finish=" + finish + ", price=" + price ;
	}





	@Override
	public boolean equals(Object obj) 
	{
		if(obj!=null && obj instanceof Nailpolish)
		{
			Nailpolish nailpolish=(Nailpolish)obj;
			if(this.brand.equals(nailpolish.brand) && this.volume==nailpolish.volume)
			{
			System.out.println(obj);
			System.out.println("nailpolish are same ");
			return true;
		}
		}
		System.out.println(obj);
		System.out.println("nailpolish not same ");
		return false;
	}
	
	public String getBrand()
    {
		return this.brand;
	}
	
	public double getVolume()
   {
		return this.volume;
	}
	public String getColor()
   {
		return this.color;
	}
	public String getFinish()
   {
		return this.finish;
	}
	public double getPrice()
   {
		return this.price;
	}
	
	
//write or set method
	public void setBrand(String a)
    {
		 this.brand=a;
	}
	
	public void setVolume(double b)
   {
		 this.volume=b;
	}
	public void setColor(String c)
   {
		 this.color=c;
	}
	public void setFinish(String d)
   {
		 this.finish=d;
	}
	public void setPrice(int price)
   {
		 this.price=price;
	}

	
}
