package com.xworkz.things.example;

public class Lace
{

	    public String color;
	    public String material;
	    public double length; // in inches
	    public double thickness; // in millimeters
	    public String style;
	    public String durability;
	    
	    public Lace()
	    {
	    	System.out.println("no arg Lace");
	    }
	    
	    @Override
	    public String toString() 
	    {
	    return  "color:"+color+" material:"+material+ " length:"+length+ " thickness:"+thickness+ " style:"+style+ " durability:"+durability;
	    }
 
	    @Override
	    public boolean equals(Object obj) 
       {
	    	System.out.println(obj);
	    	if(obj!=null && obj instanceof Lace)
	    	{
	    		Lace lace4=(Lace)obj;
	    		if(this.length==(lace4.length) && this.thickness==(lace4.thickness) &&this.material.equals(lace4.material))
	    		{
	    			
	    			System.out.println("both are same");
	    			return true;
	    		}
	    		
	    	}
	    	
	    	System.out.println("not same");
	    	 return false;
	    }
	    
}
