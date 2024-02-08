package com.xworkz.things;

import com.xworkz.things.example.Insects;
import com.xworkz.things.example.Kingdom;
import com.xworkz.things.example.Ladybug;
import com.xworkz.things.example.Mantis;

public class Runner {

	public static void main(String[] args) 
	{
		Kingdom king=new Kingdom();
		
		Insects insect1=new Insects();
		insect1.noOfAntenna=(short)2;
		System.out.println(insect1.noOfAntenna);
		insect1.pollinate();
		
		
		
		
		Mantis mantis=new Mantis();	
		System.out.println(mantis.noOfAntenna);
		mantis.cleaning();

		
		Insects insect2=new Mantis();	
		king.run(insect2);
		
		
		
		
		Ladybug ladybug=new Ladybug();
		System.out.println(ladybug.hibernation);
		ladybug.defense();

		Insects insect3=new Ladybug();	
		king.run(insect3);

}
}
