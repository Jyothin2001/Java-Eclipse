package com.xworkz.things.example;

public class Cock 
{
	 String material;
	 String color;
	 double weight;
	 String flightCharacteristics;
	 int durability;

	
	public Cock()
	{
		System.out.println("no args Cock");
	}
	
	
	@Override
	public String toString() 
	{
		return "Cock material=" + material + ", color=" + color + ", weight=" + weight + ", flightCharacteristics="+ flightCharacteristics + ", durability=" + durability ;
	}


	@Override
	public boolean equals(Object obj) 
	{
		if(obj!=null && obj instanceof Cock)
		{
			Cock cock=(Cock)obj;
			if(this.material.equals(cock.material) && this.weight==cock.weight)
			{
			System.out.println(obj);
			System.out.println("Cock are same ");
			return true;
		}
		}
		System.out.println(obj);
		System.out.println("Cock not same ");
		return false;
	}
	
	public String getFlightCharacteristics()
    {
		return this.flightCharacteristics;
	}
	
	public String getMaterial()
   {
		return this.material;
	}
	public String getColor()
   {
		return this.color;
	}
	public int getDurability()
   {
		return this.durability;
	}
	public double getWeight()
   {
		return this.weight;
	}
	
	
		
	//write or set method
	public void setFlightCharacteristics(String ab)
	{
		 this.flightCharacteristics=ab;
	}

	public void setColor(String b)
	{
		 this.color=b;
	}
	
	  public void setMaterial(String material)
      {
    	   this.material=material;      
       }
      public void setDurability(int n)
      {
    	   this.durability=n ;
      }
      public void setWeight(double n)
      {
    	   this.weight=n;
      }



}
