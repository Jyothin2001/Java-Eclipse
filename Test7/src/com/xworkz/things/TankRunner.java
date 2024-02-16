package com.xworkz.things;

import com.xworkz.things.multilevel.Animal;
import com.xworkz.things.multilevel.Dog;
import com.xworkz.things.multilevel.GoldenRetriever;
import com.xworkz.things.multilevel.Labrador;
import com.xworkz.things.multilevel.Mammal;
import com.xworkz.things.multilevel.Tank;

public class TankRunner {

	public static void main(String[] args) 
	{
		Tank tank =new Tank();
		 // tank.run(animal);
		  
		  Animal animal1=new Animal();
		  animal1.eat();
		  
		  System.out.println("-----------------");
		  Mammal mammals=new Mammal();
		  mammals.eat();//parent
		  mammals.walk();//subclass
		  
		  Animal animal2=new Mammal();
		  tank.run(animal2);//subclass
		  
		  System.out.println("-----------------");
		  
		  Dog dog =new Dog();
		  dog.bark();//subclass
		  dog.walk();//parent1
		  dog.eat();//parent
		  
		  
		  Mammal mammal3=new Dog();
		  tank.run(mammal3);//subclass
		  
		  Animal animal3=new Dog();
		  tank.run(animal3);
		  
		  System.out.println("-----------------");
		  
		  Labrador labrador=new Labrador();
		  labrador.bark();//we can get all parents method 
		  labrador.play();
		  
		   Dog dog1=new Labrador();
		   tank.run(dog1);
		   
           Mammal mammal4=new Labrador();
           tank.run(mammal4);

           Animal animal5=new Labrador();
           tank.run(animal5);
           
           System.out.println("-----------------");
           
           GoldenRetriever goldenRetriever=new GoldenRetriever();
           goldenRetriever.eat();
           goldenRetriever.walk();
           goldenRetriever.bark();
           goldenRetriever.fetch();
           
           Labrador labrador6=new GoldenRetriever();
           tank.run(labrador6);
           
           Dog dog5=new GoldenRetriever();
           tank.run(dog5);
           
           Mammal mammal5=new GoldenRetriever();
           tank.run(mammal5);
           
           Animal animal4=new GoldenRetriever();
           tank.run(animal4);
           
           
           
           
          
           
           
		  
		  
		  
	}

}
