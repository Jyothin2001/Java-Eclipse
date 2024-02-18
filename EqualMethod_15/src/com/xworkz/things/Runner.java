package com.xworkz.things;

import com.xworkz.things.example.Belt;
import com.xworkz.things.example.Button;
import com.xworkz.things.example.Carrom;
import com.xworkz.things.example.Fan;
import com.xworkz.things.example.Glass;
import com.xworkz.things.example.Lace;
import com.xworkz.things.example.Ladder;
import com.xworkz.things.example.Mug;
import com.xworkz.things.example.Plate;
import com.xworkz.things.example.Shoe;
import com.xworkz.things.example.Socks;
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

		System.out.println("---------Lace----------");
		
		    Lace lace=new Lace();
		    lace.color="white";
		   lace.durability="1 year";
		   lace.length=91.44;//cm
		   lace.material="polyster";
		   lace.style="flat";
		   lace.thickness=1.0;//mm
		   
		   
		   Lace lace1=new Lace();
		    lace1.color="white";
		   lace1.durability="2 year";
		   lace1.length=91.44;//cm
		   lace1.material="cotton";
		   lace1.style="flat";
		   lace1.thickness=2.0;//mm
		   
		   Lace lace2=new Lace();
		    lace2.color="white";
		   lace2.durability="1 year";
		   lace2.length=91.44;//cm
		   lace2.material="polyster";
		   lace2.style="flat";
		   lace2.thickness=2.0;//mm
		   
		   
		   boolean res12=lace1.equals(lace1);
		   System.out.println(res12);
		   
		   boolean res13=lace1.equals(lace2);
		   System.out.println(res13);
		   
		   boolean res14=lace2.equals(lace);
		   System.out.println(res14);
		
		System.out.println("----------------Mug----------------------");
		
		Mug mug=new Mug();
		
		mug.madeOf="steel";
		mug.type="Coffe Mug";
		mug.price=200;
		mug.capacity="325 ml";
		mug.withHandle=true;
		mug.occasion="Birthday";
		

		
		Mug mug1=new Mug();
		mug1.madeOf="Ceramic";
		mug1.type="Coffe Mug";
		mug1.price=250;
		mug1.capacity="325 ml";
		mug1.withHandle=true;
		mug1.occasion="Birthday";
		
		
		Mug mug2=new Mug();
		mug2.madeOf="Ceramic";
		mug2.type="Coffe Mug";
		mug2.price=250;
		mug2.capacity="325 ml";
		mug2.withHandle=true;
		mug2.occasion="Birthday";
		
		
		boolean value=mug.equals(mug1);
		System.out.println(value);
		
		boolean value1=mug1.equals(mug2);
		System.out.println(value1);
		
		boolean value2=mug2.equals(mug);
		System.out.println(value2);
		
		System.out.println("----------------socks----------------------");
		 
		Socks socks=new Socks();
		
		socks.color= "black";
		socks.size="medium";
		socks.material= "cotton";
		socks.price=(byte)100 ;
		socks.	brand= "Nike";
		socks.quantity= 1;
		
        Socks socks1=new Socks();
		
		socks1.color= "black";
		socks1.size="medium";
		socks1.material= "cotton";
		socks1.price=(byte)150 ;
		socks1.	brand= "Nike";
		socks1.quantity= 1;
		
        Socks socks2=new Socks();
		
		socks2.color= "white";
		socks2.size="medium";
		socks2.material= "polyster";
		socks2.price=(byte)50 ;
		socks2.	brand= "Nike";
		socks2.quantity=1;
		
		boolean value3=socks.equals(socks1);
		System.out.println(value3);
		
		boolean value4=socks1.equals(socks2);
		System.out.println(value4);
		
		boolean value5=socks2.equals(socks);
		System.out.println(value5);
		
		
		System.out.println("----------------button----------------------");
		 
		Button button=new Button();
		
		button.color= "multicolor";
		button.size=18;//mm
		button.material= "brass";
		button.price=(byte)60 ;
		button.brand= "Aakriti";
		button.shape= "square";
		
		Button button1=new Button();
		
		button1.color= "black";
		button1.size=18;
		button1.material= "brass";
		button1.price=(byte)60 ;
		button1.brand= "Aakriti";
		button1.shape= "round";
		
		Button button2=new Button();
		
		button2.color= "white";
		button2.size=18;
		button2.material= "brass";
		button2.price=(byte)60 ;
		button2.brand= "Aakriti";
		button2.shape="round";
		
		boolean butons=button.equals(button1);
		System.out.println(butons);
		
		boolean butons1=button1.equals(button2);
		System.out.println(butons1);
		
		boolean butons2=button2.equals(button);
		System.out.println(butons2);
		
		    
		System.out.println("----------------Fan----------------------");
		    
		    Fan fan=new Fan();
		    fan.speed="medium";
		    fan.clockwise=true;
		    fan.color="brown";
		    fan.powerOn=true;
		    fan.bladeMaterial="metal";
		    fan.size=(byte)30;//inches
		    
		    Fan fan1=new Fan();
		    fan1.speed="medium";
		    fan1.clockwise=true;
		    fan1.color="brown";
		    fan1.powerOn=true;
		    fan1.bladeMaterial="metal";
		    fan1.size=(byte)29;//inches
		    
		    Fan fan2=new Fan();
		    fan2.speed="medium";
		    fan2.clockwise=false;
		    fan2.color="brown";
		    fan2.powerOn=true;
		    fan2.bladeMaterial="metal";
		    fan2.size=(byte)29;//inches
		    

		    
		    
		    boolean fans=fan.equals(fan1);
			System.out.println(fans);
			
			boolean fans1=fan1.equals(fan2);
			System.out.println(fans1);
			
			boolean fans2=fan2.equals(fan);
			System.out.println(fans2);
			
		    
		    
		    
		    

				
		
		
				

	}

}
