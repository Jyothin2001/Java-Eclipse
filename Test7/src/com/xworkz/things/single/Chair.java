package com.xworkz.things.single;

public class Chair 
{
   public void support(Shape shape)
   {
	   if(shape instanceof Rectangle)
	   {
		   Rectangle  rectangle=(Rectangle)shape;
		   rectangle.area();
		   rectangle.display();
	   }
   }
}
