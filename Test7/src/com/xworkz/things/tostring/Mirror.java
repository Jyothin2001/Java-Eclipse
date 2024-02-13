package com.xworkz.things.tostring;

public class Mirror 
{ 
    public String frame;
    public int cost;
    public byte height;
   
    public Mirror(String frame,int cost,byte height)
   {
    	 this.frame=frame;
    	 this.cost=cost;
    	 this.height=height;
    }
    @Override
    public String toString()
    {
    	System.out.println("====toString=====");
		return "frame:"+ this.frame + "  Cost:"+ this.cost + "  Height:"+ this.height;
    	
    }
 
}
