package com.xworkz.things.example;

public class Kingdom 
{
	public Kingdom()
	{
		System.out.println("Kingdom=No parameter constructor ");
	}
    public void run(Insects insect)
    {
    	if(insect instanceof Mantis)
    	{
    		Mantis mantis=(Mantis)insect;
    		
    		mantis.noOfLegs=(byte)2;// subclass
    		System.out.println(mantis.noOfLegs);
    		mantis.cleaning();
    		
    		System.out.println(mantis.noOfAntenna);//parent
    		mantis.pollinate();
    	}
    	if(insect instanceof Ladybug)
    	{
    		Ladybug ladybug=(Ladybug)insect;
    		
    		ladybug.hibernation="6 months";//sub class
    		System.out.println(ladybug.hibernation);
    		ladybug.defense();
    		
    		System.out.println(ladybug.noOfAntenna);//parent
    		ladybug.pollinate();
    		
    	}
    	
    }
}
