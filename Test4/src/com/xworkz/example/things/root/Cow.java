package com.xworkz.example.things.root;

public class Cow extends Animal
{
	@Override
	public void eat()
	 {
		 System.out.println("sub:EAT");
	 }
	@Override
	public void reproduce()
	 {
		 System.out.println("sub:REPRODUCE");
	 }

	public void giveMilk()
	 {
		 System.out.println("produce milk");
	 }

	public void giveDung()
	 {
		 System.out.println("used in production of bio_gas");
	 }
}
