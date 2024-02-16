package com.xworkz.things.example;

public class Glass 
{
	
		
		public int price;
		public String color;
		public char size;
		public String type;
		public String material;
		public String capacity;
		
		
		
		
		public Glass()
		{
			System.out.println("no argument Glass");
			
		}
		
		@Override
		public String toString()
		{
			
			return "Glass-Price: " +this.price+ " Color: " +this.color+" Size: "+this.size+  " Type : " +this.type+ " Materialt: "+material+ " Capacity: " +capacity;
		}
		

		@Override
		public boolean equals(Object obj) {
			
			System.out.println("equals in:"+this);
			
			
			
			if(obj != null && obj instanceof  Glass)
			{
				
				Glass glass=(Glass)obj;
				if(this.size==glass.size  && this.type.equals(glass.type)  && this.material.equals(glass.material))
				{
					System.out.println("equals in:"+obj);
					System.out.println("Glass are same ");
					return true;
				}

				
			}
			System.out.println("not same");
			return false;
			
			
			
	}		
		}


