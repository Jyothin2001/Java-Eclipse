package com.xworkz.test2;

import com.xworkz.test2.example.Biscuit;
import com.xworkz.test2.example.Location;
import com.xworkz.test2.example.Monkey;
import com.xworkz.test2.example.Tree;

public class TreeRunner {

	public static void main(String[] args) 
	{
		Tree tree=new Tree();    //Instantiation / memory allocate to Tree 
		tree.name="Mango Tree";   // initializing value
		System.out.println(tree.name);
		
		tree.location=new Location();   //Instantiation / memory allocation
		tree.location.area="kr puram";
		tree.location.city="bengaluru";
		
		System.out.println(tree.location.area);
		System.out.println(tree.location.city);
		
		
		 tree.monkey=new Monkey();
		 tree.monkey.age=98;
		 tree.monkey.type="Gorilla";
		 tree.monkey.biscuit=new Biscuit();
		 tree.monkey.biscuit.brand="parle-G";
		 tree.monkey.biscuit.cost=20d;
		 
		 System.out.println(tree.monkey.age);
		 System.out.println(tree.monkey.type);
		 System.out.println(tree.monkey.biscuit.brand);
		 System.out.println(tree.monkey.biscuit.cost);
		 
		 Monkey monkey1= new Monkey();
		 System.out.println(monkey1.age);  //output=0
		 System.out.println(monkey1.type);  //output=null 
		 
		 monkey1.age=20; // initialize again because it's a another memory allocation to Monkey()
		 System.out.println(monkey1.age);
		 
		 /*tree.monkey2=new Monkey();
		 tree.monkey2.age=90; // monkey2 reference is not in tree so create that
		 System.out.println(tree.monkey2.age); */
		 
			
		 
		 
		 
		

	}

}
