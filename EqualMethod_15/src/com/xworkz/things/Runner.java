package com.xworkz.things;

import com.xworkz.things.example.Belt;
import com.xworkz.things.example.Carrom;
import com.xworkz.things.example.Glass;
import com.xworkz.things.example.Ladder;
import com.xworkz.things.example.Plate;
import com.xworkz.things.example.Shoe;
import com.xworkz.things.example.Stand;

public class Runner 
{

	public static void main(String[] args)
	{
		Belt belt=new Belt();
		belt.length=16;
		belt.brand="Louis philippe";
		belt.material="lether";
		belt.price=100;
		belt.type="flat belt1";
		belt.countryOfOrigin="india";
		
		Belt belt1=new Belt();
		belt1.length=16;
		belt1.material="lether";
		belt1.price=120;
		belt1.type="flat belt";
		belt1.brand="Louis philippe";
		belt1.countryOfOrigin="india";
		
		Belt belt2=new Belt();
		belt2.length=16;
		belt2.material="lether";
		belt2.price=120;
		belt2.type="flat belt";
		belt2.brand="Louis philippe";
		belt2.countryOfOrigin="india";
		
		//boolean ref=belt.equals(null);
		boolean ref1=belt.equals(belt1);
		System.out.println(ref1);
		System.out.println("-------------------");
		
		boolean ref2=belt1.equals(belt2);
		System.out.println(ref2);
		System.out.println("-------------------");
		
		boolean ref3=belt2.equals(belt);
		System.out.println(ref3);
		System.out.println("-------------------");
		
		System.out.println("---------stand----------");
		
		Stand stand=new Stand();
		stand.color="brown";
		stand.depth=1.5;
		stand.height=106;
		stand.material="wood";
		stand.numberOfShelves=8;
		stand.width=4.24;
		
		Stand stand1=new Stand();
		stand1.color="white";
		stand1.depth=2;
		stand1.height=106;
		stand1.material="wood";
		stand1.numberOfShelves=9;
		stand1.width=5.24;
		
		Stand stand2=new Stand();
		stand2.color="brown";
		stand2.depth=1.4;
		stand2.height=106;
		stand2.material="wood";
		stand2.numberOfShelves=8;
		stand2.width=5.24;
		
		
		
		boolean ref4=stand.equals(stand1);
		System.out.println(ref4);
		System.out.println("-------------------");
				
		boolean ref5=stand1.equals(stand2);
		System.out.println(ref5);
	    System.out.println("-------------------");
				
	    boolean ref6=stand2.equals(stand);
		System.out.println(ref6);
	    System.out.println("-------------------");
				
		System.out.println("---------shoe----------");
		
		
		Shoe shoe=new Shoe();
		shoe.brand="nike";
		shoe.color="white";
		shoe.country="india";
		shoe.size=5;
		shoe.startedYear=2001;
		shoe.laceColor="black";
		
		Shoe shoe1=new Shoe();
		shoe1.brand="adidas";
		shoe1.color="white";
		shoe1.country="india";
		shoe1.size=5;
		shoe1.startedYear=2001;
		shoe1.laceColor="black";
		
		Shoe shoe2=new Shoe();
		shoe2.brand="nike";
		shoe2.color="white";
		shoe2.country="india";
		shoe2.size=5;
		shoe2.startedYear=2001;
		shoe2.laceColor="black";
		
		boolean ref7=shoe.equals(shoe1);
		System.out.println(ref7);
		System.out.println("-------------------");
		
		boolean ref8=shoe1.equals(shoe2);
		System.out.println(ref8);
		System.out.println("-------------------");
		
		boolean ref9=shoe2.equals(shoe);
		System.out.println(ref9);
		System.out.println("-------------------");
		
		System.out.println("---------Glass----------");
		
		   Glass glass=new Glass();
	        glass.price=40;//8
			glass.color="Transparent";
			glass.size='M';
			glass.type="Juice Glass";
			glass.material="plastic";
			glass.capacity="300ml";
			
		
		   Glass glass1=new Glass();
			glass1.price=90;
			glass1.color="Transparent";
			glass1.size='M';
			glass1.type="Juice Glass";
			glass1.material="Glass";
			glass1.capacity="300ml";
			
			
           Glass glass2=new Glass();
           glass2.type="Water Glasss";
			glass2.material="plastic";
			glass2.capacity="200ml";
			glass2.price=100;
			glass2.color="transparent";
			glass2.size='M';
			
			
			boolean res=glass.equals(glass1);
			System.out.println(res);
			
			System.out.println("-------------------");
			
			boolean res1=glass1.equals(glass2);
			System.out.println(res1);
			
			System.out.println("-------------------");
			
			boolean res2=glass2.equals(glass);
			System.out.println(res2);
			
			System.out.println("---------ladder----------");
		
		    Ladder ladder=new Ladder();
		    ladder.foldable="yes";
			ladder.color="Silver";
			ladder.price=7000;
			ladder.material="fiberglass ladders ";
			ladder.numberOfSteps=11;
			ladder.warranty=2;
			


			Ladder ladder1=new Ladder();
			ladder1.foldable="yes";
			ladder1.color="Silver";
			ladder1.price=5400;
			ladder1.material="fiberglass ladders ";
			ladder1.numberOfSteps=11;
			ladder1.warranty=2;

			
			Ladder ladder2=new Ladder();
			ladder2.foldable="yes";
			ladder2.color="Silver";
			ladder2.price=2000;
			ladder2.material="Wood";
			ladder2.numberOfSteps=15;
			ladder2.warranty=4;
			
			
			boolean res3=ladder.equals(ladder1);
			System.out.println(res3);
			
			System.out.println("-------------------");
			
			boolean res4=ladder1.equals(ladder2);
			System.out.println(res4);
			
			System.out.println("-------------------");
			
			boolean res5=ladder2.equals(ladder);
			System.out.println(res5);

			System.out.println("---------plate,----------");
		
		    Plate plate=new Plate();
			plate.type="Dinner Plate";
			plate.price=500;
			plate.color="Silver";
			plate.material="Stainless Steel";
			plate.shape="Round";
			plate.disposable=false;	
			
           Plate plate1=new Plate();
		    plate1.type="Dinner Plate";
			plate1.price=900;
			plate1.color="plastic";
			plate1.material="Stainless Steel";
			plate1.shape="Round";
			plate1.disposable=true;		
		
            Plate plate2=new Plate();
		    plate2.type="Dinner Plate";
			plate2.price=900;
			plate2.color="Silver";
			plate2.material="Stainless Steel";
			plate2.shape="Square";
			plate2.disposable=false;

			
			boolean res6=plate.equals(plate1);
			System.out.println(res6);
			
			System.out.println("-------------------");
			
			boolean res7=plate1.equals(plate2);
			System.out.println(res7);
			
			System.out.println("-------------------");
			
			boolean res8=plate2.equals(plate);
			System.out.println(res8);

			System.out.println("---------stand,shoe,socks,----------");
		
		    Carrom carrom=new Carrom();
		    carrom.price=3000;
			carrom.material="Wooden";
			carrom.size="large";
			carrom.frameMaterial="Wooden";
			carrom.waterResistant=true;
			carrom.capacity="7kg";
			
			Carrom carrom1=new Carrom();
			carrom1.price=2000;
			carrom1.material="Wooden";
			carrom1.size="medium";
			carrom1.frameMaterial="Wooden";
			carrom1.waterResistant=false;
			carrom1.capacity="6kg";	
			
			Carrom carrom2=new Carrom();
		    carrom2.price=3000;
			carrom2.material="Wooden";
			carrom2.size="large";
			carrom2.frameMaterial="Wooden";
			carrom2.waterResistant=true;
			carrom2.capacity="7kg";	
			
			
			boolean res9=carrom.equals(carrom1);
			System.out.println(res9);
			
			System.out.println("-------------------");
			
			boolean res10=carrom1.equals(carrom2);
			System.out.println(res10);
			
			System.out.println("-------------------");
			
			boolean res11=carrom2.equals(carrom);
			System.out.println(res11);



				
		
		
				

	}

}
