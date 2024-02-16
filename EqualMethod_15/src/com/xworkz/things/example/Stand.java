package com.xworkz.things.example;

public class Stand 
{

	public  double width;
	public int height;
	public String material;
	public String color;
	public int numberOfShelves;
	public double depth;

	public Stand()
	 {
		  System.out.println("no argument stand");
	 }
	
	@Override
	public String toString() 
	{
		
		return "width:" +this.width + "    ,height: "+this.height + "     ,material: "+this.material + ",      color: "+this.color +",  numberOfShelves: "+this.numberOfShelves+"   depth:"+this.depth;
	}

	
	@Override
	public boolean equals(Object obj) 
	{
		System.out.println("stand : "+this);
		
		if(obj!=null&&obj instanceof Stand)
		{
			
			Stand vari=(Stand)obj;
			
			if(this.height==vari.height && this.numberOfShelves==vari.numberOfShelves && this.material.equals(vari.material))
			{
				System.out.println("equals in:"+obj);
				System.out.println("stands are same ");
				return true;
			}
		}
		System.out.println("not same");
		return false;
	}


	
}
