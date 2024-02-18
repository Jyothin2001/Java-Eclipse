package com.xworkz.things.example;

public class Button 
{ 
	public String color;	
	public byte size;
	public String brand;	
	public String shape;
	public String  material;
	public int price;
	
	 public Button()
	 {
		  System.out.println("no argument Button");
	 }
	
	@Override
	public String toString() 
	{
		
		return "color:" +this.color + "    ,size: "+this.size + "     ,material: "+this.material + ",      price: "+this.price +",  brand: "+this.brand+"   shape:"+this.shape;
	}

	
	@Override
	public boolean equals(Object obj) 
	{
		
		
		if(obj!=null&&obj instanceof Button)
		{
			
			Button button=(Button)obj;
			
			if(this.size==button.size && this.price==button.price && this.shape.equals(button.shape))
			{
				System.out.println("equals in:"+obj);
				System.out.println("Button are same ");
				return true;
			}
		}
		System.out.println("equals in:"+obj);
		System.out.println("not same");
		
		return false;
	}



}
