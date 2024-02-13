package com.xworkz.things;

import com.xworkz.things.single.Chair;
import com.xworkz.things.single.Rectangle;
import com.xworkz.things.single.Shape;

public class ShapeRunner {

	public static void main(String[] args) 
	{
		Chair chair=new Chair();
		
		Shape shape=new Shape();
		shape.display();
		
		System.out.println("-------------");
		
		Rectangle Rectangle=new Rectangle();
		Rectangle.area();
		
		Shape shape1=new Rectangle();
		chair.support(shape1);
		
		}

}
