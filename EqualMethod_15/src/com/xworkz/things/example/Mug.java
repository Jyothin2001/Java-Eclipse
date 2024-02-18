package com.xworkz.things.example;


public class Mug 
{

	
	public String madeOf;
	public String type;
	public int price=300;
	public String capacity;
	public boolean withHandle;
	public String occasion;
	
	public Mug()
	{
		System.out.println("no args Mug");
		
		
	}
	
	@Override
	public String toString()
	{
		
		 return  "madeOf:"+madeOf+" capacity:"+capacity+ " type:"+type+ " price:"+price+ " withHandle:"+withHandle+ " occasion:"+occasion;
	}
	@Override
	public boolean equals(Object obj)
	{

		System.out.println(obj);
    	if(obj!=null && obj instanceof Mug)
    	{
    		Mug mug=(Mug)obj;
 		if(withHandle==mug.withHandle && madeOf.equals(mug.madeOf) && capacity.equals(mug.capacity))
    		{
    			
    			System.out.println("both are same");
    			return true;
    		}
    		
    	}
    	
    	System.out.println("not same");
    	 return false;
	}
	

}
