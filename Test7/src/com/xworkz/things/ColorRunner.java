package com.xworkz.things;

import com.xworkz.things.hierarchical.BlueColor;
import com.xworkz.things.hierarchical.Color;
import com.xworkz.things.hierarchical.GreenColor;
import com.xworkz.things.hierarchical.Pencil;
import com.xworkz.things.hierarchical.PinkColor;
import com.xworkz.things.hierarchical.WhiteColor;

public class ColorRunner {

	public static void main(String[] args) 
	{
		Pencil pencil=new Pencil();
		
		Color color=new Color();
		color.communication();
  
		System.out.println("---------------");
		
		PinkColor pink=new PinkColor();
		pink.calm();
		
		Color color1=new PinkColor();
		pencil.write(color1);
		
		System.out.println("---------------");
		
		BlueColor blueColor=new BlueColor();
		blueColor.communication();
		blueColor.relaxation();
		
		Color color2=new BlueColor();
		pencil.write(color2);
		
		System.out.println("---------------");
		
		GreenColor greenColor=new GreenColor();
		greenColor.balance();//get all the members of parent
		
		Color color3=new GreenColor();
		pencil.write(color3);
		
		System.out.println("---------------");
		
		WhiteColor whiteColor=new WhiteColor();
		whiteColor.purity();//get all the members of parent
		
		Color color4=new WhiteColor();
		pencil.write(color4);
		
	}

}
