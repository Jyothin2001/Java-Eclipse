package com.xworkz.things.example;

public class Ladder 
{

		
		public String color;
		public int price;
		public String material;
		public String foldable;
		public int numberOfSteps;
		public int warranty;
		
		
		
		public Ladder()
		{
			System.out.println("no argument Ladder");
			
		}
		
		@Override
		public String toString() {
			
			return "Ladder-color: " +this.color+ " Price: " +this.price+" Material: "+this.material+  " NumberOfSteps : "+this.numberOfSteps+ " Warranty: "+warranty;
		}

		@Override
		public boolean equals(Object obj)
		{
		
			if(obj != null && obj instanceof  Ladder)
			{
				
				Ladder result=(Ladder)obj;
			
				if(this.foldable.equals(foldable) && this.material.equals(result.material)&& this.numberOfSteps==result.numberOfSteps)
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
