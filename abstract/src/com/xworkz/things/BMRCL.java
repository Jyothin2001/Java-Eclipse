package com.xworkz.things;

public  class BMRCL extends Metro
{
BMRCL(String metroName, String color) 
{
		super(metroName, color);

	}

public static void main(String[] args) 
{
	
  BMRCL bm=new BMRCL("namma metro","blue and white  ");
  System.out.println("color: "+bm.color + "and name: "+bm.metroName);
  
  Metro bm1=new BMRCL("metro","blue  ");
  System.out.println("color: "+bm1.color + "and name: "+bm1.metroName);
  
  bm.run();
}

}
