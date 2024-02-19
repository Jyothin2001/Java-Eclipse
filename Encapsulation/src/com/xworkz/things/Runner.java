package com.xworkz.things;

import com.xworkz.things.example.Basket;
import com.xworkz.things.example.Box;
import com.xworkz.things.example.Cock;
import com.xworkz.things.example.Nailpolish;
import com.xworkz.things.example.Pot;

public class Runner 
{

	public static void main(String[] args) 
	{
		Box box=new Box();
		
	    box.setCapacity(200);
		System.out.println(box.getCapacity());
		
		box.setColor("blue");
		System.out.println(box.getColor());
		
		box.setCompartments(3);
		System.out.println(box.getCompartments());
		
		box.setMaterial("plastic");
		System.out.println(box.getMaterial());
		
		box.setType("lunch box");
		System.out.println(box.getType());
		
        Box box1=new Box();
		
	    box1.setCapacity(250);
		System.out.println(box1.getCapacity());
		
		box1.setColor("blue");
		System.out.println(box1.getColor());
		
		box1.setCompartments(3);
		System.out.println(box1.getCompartments());
		
		box1.setMaterial("steel");
		System.out.println(box1.getMaterial());
		
		box1.setType("lunch box");
		System.out.println(box1.getType());
		
		boolean ref=box.equals(box1);
		System.out.println(ref);
		
		
		System.out.println("------------pot--------------");
		
		Pot pot=new Pot();
		
		pot.setCapacity(1);//liter
		System.out.println(pot.getCapacity());
		
		pot.setColor("brown");
		System.out.println(pot.getColor());
		
		pot.setMaterial("mud");
		System.out.println(pot.getMaterial());
		
		pot.setSize(9);//inches
		System.out.println(pot.getSize());
		
		pot.setWeight(500);//grams
		System.out.println(pot.getWeight());
		
		
        Pot pot1=new Pot();
		
		pot1.setCapacity(1);//liter
		System.out.println(pot1.getCapacity());
		
		pot1.setColor("red");
		System.out.println(pot1.getColor());
		
		pot1.setMaterial("ceramic");
		System.out.println(pot1.getMaterial());
		
		pot1.setSize(10);//inches
		System.out.println(pot1.getSize());
		
		pot1.setWeight(500);//grams
		System.out.println(pot1.getWeight());
		
		boolean ref1=pot.equals(pot1);
		System.out.println(ref1);
		
		System.out.println("------------cock--------------");
		

		
		Cock cock=new Cock();
		
		cock.setColor("white");
		System.out.println(cock.getColor());
		
		cock.setDurability(1);//year
		System.out.println(cock.getDurability());
		
		cock.setFlightCharacteristics("highly skewed parabolic flight trajectory");
		System.out.println(cock.getFlightCharacteristics());
		
		cock.setMaterial("the bark of the cork tree");
		System.out.println(cock.getMaterial());
		
		cock.setWeight(4.75d);//grams
		System.out.println(cock.getWeight());
		
        Cock cock1=new Cock();
		
		cock1.setColor("white");
		System.out.println(cock1.getColor());
		
		cock1.setDurability(1);//year
		System.out.println(cock1.getDurability());
		
		cock1.setFlightCharacteristics("highly skewed parabolic flight trajectory");
		System.out.println(cock1.getFlightCharacteristics());
		
		cock1.setMaterial(" bark of the cork tree");
		System.out.println(cock1.getMaterial());
		
		cock1.setWeight(4.75d);
		System.out.println(cock1.getWeight());
		
		boolean res=cock.equals(cock1);
		System.out.println(res);
		
		System.out.println("------------Nailpolish--------------");
		
		Nailpolish nailpolish=new Nailpolish();
		
		nailpolish.setBrand("dazzler");
		System.out.println(nailpolish.getBrand());
		
		
		nailpolish.setColor("white");
		System.out.println(nailpolish.getColor());
		
		nailpolish.setFinish("glossy");//year
		System.out.println(nailpolish.getFinish());
		
		nailpolish.setPrice(100);
		System.out.println(nailpolish.getPrice());
		
		nailpolish.setVolume(5.5d);//ml
		System.out.println(nailpolish.getVolume());
		
        Nailpolish nailpolish1=new Nailpolish();
		
		nailpolish1.setBrand("dazzler");
		System.out.println(nailpolish1.getBrand());
		
		
		nailpolish1.setColor("white");
		System.out.println(nailpolish1.getColor());
		
		nailpolish1.setFinish("glossy");//year
		System.out.println(nailpolish1.getFinish());
		
		nailpolish1.setPrice(100);
		System.out.println(nailpolish1.getPrice());
		
		nailpolish1.setVolume(5.5d);//ml
		System.out.println(nailpolish1.getVolume());

				
		boolean res1=nailpolish.equals(nailpolish1);
		System.out.println(res1);
	
         System.out.println("------------basket--------------");
		
         Basket basket1=new Basket();
         
         basket1.setSize(9);//inches
 		System.out.println(basket1.getSize());
 		
 		basket1.setColor("blue");
 		System.out.println(basket1.getColor());
 		
 		basket1.setPrice(1000);
 		System.out.println(basket1.getPrice());
 		
 		basket1.setMaterial("plastic");
 		System.out.println(basket1.getMaterial());
 		
 		basket1.setType("lunch box");
 		System.out.println(basket1.getType());
 		
 		Basket basket2=new Basket();
        
        basket2.setSize(8);//inches
		System.out.println(basket2.getSize());
		
		basket2.setColor("blue");
		System.out.println(basket2.getColor());
		
		basket2.setPrice(1000);
		System.out.println(basket2.getPrice());
		
		basket2.setMaterial("plastic");
		System.out.println(basket2.getMaterial());
		
		basket2.setType("lunch box");
		System.out.println(basket2.getType());
		
		boolean result=basket1.equals(basket2);
		System.out.println(result);
	
		
		
				
		
		
    }

}
