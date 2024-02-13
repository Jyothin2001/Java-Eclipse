package com.xworkz.things.multilevel;

public class Tank 
{
   
	public void run(Animal animal)
	{
		if(animal instanceof Mammal)
		{
			Mammal mammal1=(Mammal)animal;
			mammal1.walk();
		
		}
		if(animal instanceof Dog )
		{
			Dog dog=(Dog)animal;
			dog.bark();
			dog.eat();
			dog.walk();
		}

		if(animal instanceof Labrador)
		{
			Labrador labrador=(Labrador)animal;
			labrador.play();
			labrador.eat();
			labrador.bark();
			labrador.walk();
			
		}
		if(animal instanceof GoldenRetriever)
		{
			GoldenRetriever goldenRetriever=(GoldenRetriever)animal;
			goldenRetriever.fetch();
			goldenRetriever.bark();
			goldenRetriever.eat();
			goldenRetriever.play();
			goldenRetriever.walk();
		}
		
	}
}
