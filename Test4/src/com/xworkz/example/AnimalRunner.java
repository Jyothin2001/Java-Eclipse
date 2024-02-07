package com.xworkz.example;

import com.xworkz.example.things.root.Animal;
import com.xworkz.example.things.root.Cow;
import com.xworkz.example.things.root.JerseyCattle;

public class AnimalRunner {

	public static void main(String[] args) 
	{
		 Animal ani=new Animal();
		 ani.eat();
		 ani.reproduce();
		 
		 System.out.println("-------------------------");  
		 
		 Cow cow=new Cow();   //1st way
		 cow.eat(); //override==JVM will decide which method should i execute if method names are same is called "run time polymorphism'
		 cow.reproduce();//override
		 cow.giveMilk();
		 cow.giveDung();  
		 
		 Animal animal=new Cow();  // 2nd way =in this we are not getting methods of cow so do "data type casting"
		 animal.eat();
		 animal.reproduce();
		// animal.giveMilk();
		//animal.giveDung();  
		 
		  Cow cow1=(Cow)animal; //convert parent reference to sub class reference
		  cow1.giveMilk();
		  cow1.giveDung();  
		  
			
		  System.out.println("-------------------------"); 
		 
		 JerseyCattle jersey= new JerseyCattle();   //1st way
		 jersey.eat();
		 jersey.reproduce();
		 jersey.giveMilk();
		 jersey.giveDung();
		 jersey.butterFat();
		 jersey.richInProtein();
		 
		 System.out.println("-------------------------");
		 
		 Cow cow2 = new JerseyCattle();  //2nd way
		 cow2.eat();
		 cow2.reproduce();
		 cow2.giveMilk();
		 cow2.giveDung(); 
		// cow2.butterFat();
		// cow2.richInProtein();
		 
		 JerseyCattle jersey5=(JerseyCattle)cow2;  //data type casting
		 jersey5.butterFat();
		 jersey5.richInProtein();
			 
		 System.out.println("-------------------------");
		 
		 
		 Animal ani4 = new JerseyCattle(); //3rd way
		 ani4.eat();
		 ani4.reproduce();
		 //ani1.giveMilk();
		 // ani1.giveDung(); 
		 //ani1.butterFat();
		 //ani1.richInProtein();
		 
		 JerseyCattle jersey6=(JerseyCattle)ani4;
		 jersey6.giveMilk();
		 jersey6.giveDung(); 
		 jersey6.butterFat();
		 jersey6.richInProtein();
		 
		  System.out.println("-------------------------");
		 

	}

}
