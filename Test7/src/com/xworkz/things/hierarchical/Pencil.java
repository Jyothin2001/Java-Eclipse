package com.xworkz.things.hierarchical;

public class Pencil 
{
 public void write(Color color)
 {
	 if(color instanceof PinkColor)
	 {
		 PinkColor pinkColor=(PinkColor)color;
		 pinkColor.communication();
		 pinkColor.calm();
		 
	 }
	 if(color instanceof BlueColor)
	 {
		 BlueColor blueColor=(BlueColor)color;
		 blueColor.communication();
		 blueColor.relaxation();
		 
	 }
	 if(color instanceof GreenColor)
	 {
		 GreenColor greenColor=(GreenColor)color;
		 greenColor.communication();
		 greenColor.balance();
		 
	 }
	 if(color instanceof WhiteColor)
	 {
		 WhiteColor whiteColor=(WhiteColor)color;
		 whiteColor.communication();
		 whiteColor.purity();
		 
	 }
	 
 }
}
