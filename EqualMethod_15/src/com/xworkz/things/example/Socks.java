package com.xworkz.things.example;

public class Socks 
{
	     public String color;
	     public String size;
	     public String material;
	     public byte price;
	     public  String brand;
		 public byte quantity;
		 
		 public Socks()
		 {
			  System.out.println("no argument Socks");
		 }
		
		@Override
		public String toString() 
		{
			
			return "color:" +this.color + "    ,size: "+this.size + "     ,material: "+this.material + ",      price: "+this.price +",  brand: "+this.brand+"   quantity:"+this.quantity;
		}

		
		@Override
		public boolean equals(Object obj) 
		{
			
			
			if(obj!=null&&obj instanceof Socks)
			{
				
				Socks socks=(Socks)obj;
				
				if(this.quantity==socks.quantity || this.price==socks.price && this.material.equals(socks.material))
				{
					System.out.println("equals in:"+obj);
					System.out.println("socks are same ");
					return true;
				}
			}
			System.out.println("equals in:"+obj);
			System.out.println("not same");
			
			return false;
		}


}
