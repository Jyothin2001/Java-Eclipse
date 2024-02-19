package com.xworkz.things.example;

public class Pot 
{
	private  int capacity;
	private String material;
	private String color;
	private int size;
	private int weight;
	
	public Pot()
	{
		System.out.println("no args Pot");
	}
	
	@Override
	public String toString() 
	{
		return "Box capacity=" + capacity + ", material=" + material + ", color=" + color + ", compartments=" + size + ", weight=" + weight ;
	}
	@Override
	public boolean equals(Object obj) 
	{
		if(obj!=null && obj instanceof Pot)
		{
			Pot pot=(Pot)obj;
			if(this.material.equals(pot.material) || this.color.equals(pot.color))
			{
			System.out.println(obj);
			System.out.println("pots are same ");
			return true;
		}
		}
		System.out.println(obj);
		System.out.println("pots not same ");
		return false;
	}
	
	public int getCapacity()
    {
		return this.capacity;
	}
	
	public String getMaterial()
   {
		return this.material;
	}
	public String getColor()
   {
		return this.color;
	}
	public int getSize()
   {
		return this.size;
	}
	public int getWeight()
   {
		return this.weight;
	}
	
	
		
	//write or set method
	public void setCapacity(int a)
	{
		this.capacity=a;
	}

	public void setColor(String b)
	{
		 this.color=b;
	}
	
	  public void setMaterial(String material)
      {
    	   this.material=material;      
       }
      public void setSize(int n)
      {
    	   this.size=n ;
      }
      public void setWeight(int n)
      {
    	   this.weight=n;
      }


	
}
