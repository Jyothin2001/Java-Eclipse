	package com.xworkz.runner;

import com.xworkz.examples.Addition;
import com.xworkz.examples.Bag;
import com.xworkz.examples.Bike;
import com.xworkz.examples.Car;
import com.xworkz.examples.Dog;
import com.xworkz.examples.MaximumNumber;
import com.xworkz.examples.Tree;
import com.xworkz.examples.Substraction;
import com.xworkz.examples.multiplication;

public class FunctinalInterfaceRunner 
{

	public static void main(String[] args) 
	{
		
	
		//implementation and instantiation
		Bike bike=()->System.out.println("bike is usefull for transporttaion");
		bike.transportation();
		
		System.out.println("===============================");
		
		
		Dog dog=()->
		{
			
			System.out.println("dog is barking");
			return true;
				
		};
		boolean d1=dog.bark();
		System.out.println(d1);
		
		System.out.println("===============================");
		
		Bag bag=()->
		{
			return 10;
		};
		int n=bag.color();
		System.out.println("bag: "+n);
		System.out.println("===============================");
	
		//with one param and no return
		Car car=a->System.out.println("Car speed per hour is: "+a);	
		
		car.speed(70);
		System.out.println("===============================");
		
		
		Addition add=(a,b)->
		{
			int c=a+b;
			System.out.println("a="+a+", b="+b+" = "+c);
			//return c;
			
		};
		add.add(5,10);
		System.out.println("===============================");
		
   multiplication result=(d,e,f)->
   {
	   double multiplication=d*e*f;
	   System.out.println("Car speed per hour is: "+multiplication);
	   
   };
   result.multi(10.5f,2,5.20d);
   
   System.out.println("===============================");
   
   
   MaximumNumber maxi=(a)->
   {
	  return (a>=10)?true:false;
	   
	  
   };
 boolean aa=  maxi.isGreater(10);
 System.out.println(aa);
   System.out.println("===============================");
   
   Tree tree=()->
   {
	   String name="jyothi";
	   String name1="n";
	  String a= name.concat(name1);

    //System.out.println("concatination: " +a);
   return a;
     
};
   String ab=tree.provideFruite();
   System.out.println(ab);
   
   System.out.println("===============================");
   
   Substraction watch=(num,num1)->
   {
	  int num2=num-num1;
	   return num2;
	   
   };
   double h=watch.minus(2300,2500);
   System.out.println(h);
		
	}
}


