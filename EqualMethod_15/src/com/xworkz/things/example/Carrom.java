package com.xworkz.things.example;

public class Carrom 
{

		public int price;
		public String material;
		public String size;
		public String frameMaterial;
		public boolean waterResistant;
		public String capacity;

		
		
		
		public Carrom()
		{
			System.out.println("no argument carrom");
			
		}
		@Override
		public String toString() {
			
			return "Carrom-Price: " +this.price+ "Material: " +this.material+ "Size: "+this.size+  "Frame Material: " +this.frameMaterial+ "Water Resistant: "+waterResistant+ "Capacity: " +capacity;
		}
			

		@Override
		public boolean equals(Object obj) 
		{
            if(obj != null && obj instanceof  Carrom)
			{
				
				Carrom result=(Carrom)obj;
				if( this.size.equals(result.size) && this.material.equals(result.material)   && this.capacity.equals(result.capacity) || this.waterResistant==result.waterResistant)
				{
					System.out.println("equals in:"+obj);
					System.out.println("carrom are same ");
					return true;
				}
				}

			System.out.println("not same ");
            return false;
			
		
	}		
}



