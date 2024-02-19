package com.xworkz.things.example;

public class Box 
{
	private  int capacity;
	private String material;
	private String color;
	private int compartments;
	private String type;
	
	public Box()
	{
		System.out.println("no args Box");
	}
	
	@Override
	public String toString() 
	{
		return "Box capacity=" + capacity + ", material=" + material + ", color=" + color + ", compartments=" + compartments + ", type=" + type ;
	}
	@Override
	public boolean equals(Object obj) 
	{
		if(obj!=null && obj instanceof Box)
		{
			Box box=(Box)obj;
			if(this.compartments==box.compartments && this.material.equals(box.material) && this.color.equals(box.color))
			{
				System.out.println("boxs are same");
			System.out.println(obj);
			return true;
		}
		}
		System.out.println("Basket are not same");
		System.out.println(obj);
		return false;
	}
	
	//read or get  method
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
	public int getCompartments()
    {
		return this.compartments;
	}
	public String getType()
    {
		return this.type;
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
      public void setCompartments(int n)
      {
    	   this.compartments=n ;
      }
      public void setType(String type)
      {
    	   this.type=type ;
      }
}