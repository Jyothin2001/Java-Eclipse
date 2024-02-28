package com.xworkz.things.example;

public class Belt 
{
	public double length;
	public String type;
	public int price;
	public String material;
	public String brand;
	public String countryOfOrigin;
	
	
	
	
 public Belt()
 {
	  System.out.println("no argument belt");
 }
 @Override
public String toString()
 {
	
	 return "length:" +this.length + "    ,type: "+this.type + "     ,price: "+this.price + ",      material: "+this.material +",  brand: "+this.brand;
}

 @Override
public boolean equals(Object obj)
{
	if(obj!=null && obj instanceof Belt)
	{
		Belt belt=(Belt)obj;
		
		if(this.length==belt.length && this.type.equals(belt.type) && this.material.equals(belt.material))
		{
			System.out.println("equals in:"+obj);
			System.out.println("Belts are same ");
			return true;
		}
		
	}
	System.out.println("not same");
	return false;
}
}
/*int num=6;
       int count=0;
       if(num>1)
       {
       for(int i=1;i<=num;i++)
       {
    	   if(num%i==0)
    		   count++;
       }
       if(count==2)
       {
    	   System.out.println(num + " is a prime");
       }
       else 
       {
    	   System.out.println(num +" is not a prime");
       }
	}
       else
       {
    	   System.out.println("1 prime");
       }
	}*/

