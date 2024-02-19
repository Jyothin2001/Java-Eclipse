package com.xworkz.things.example;

public class Basket 
{
	    private int size;
	    private String type; 
	    private String material;
	    private String color;
	    private double price;

	    public Basket()
		{
			System.out.println("no args Basket");
		}
		
		
		@Override
		public String toString() 
		{
			return "Basket size=" + size + ", type=" + type + ", material=" + material + ", color=" + color+ ", price=" + price ;
		}


		@Override
		public boolean equals(Object obj) 
		{
			if(obj!=null && obj instanceof Basket)
			{
				Basket basket=(Basket)obj;
				if(this.size==basket.size && this.material.equals(basket.material))
				{
					System.out.println("Basket are same");
				System.out.println(obj);
				return true;
			}
			}
			System.out.println("Baskets are not same");
			System.out.println(obj);
			return false;
		}
		
		//read or get  method
		public int getSize()
	     {
			return this.size;
		}
		
		public String getMaterial()
	    {
			return this.material;
		}
		public String getColor()
	    {
			return this.color;
		}
		public double getPrice()
	    {
			return this.price;
		}
		public String getType()
	    {
			return this.type;
		}
			
		//write or set method
		public void setSize(int a)
		{
			 this.size=a;
		}

		public void setColor(String b)
		{
			this.color=b;
		}
	      public void setMaterial(String material)
	      {
	    	   this.material=material;      
	       }
	      public void setPrice(int n)
	      {
	    	   this.price=n ;
	      }
	      public void setType(String type)
	      {
	    	   this.type=type ;
	      }

}
