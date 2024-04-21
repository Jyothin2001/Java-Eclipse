package com.xworkz.PreDefineFI;

import java.util.function.BooleanSupplier;
//for this class it is am abstraction this class dont know the implementation part.
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;


public class BooleanSupplierAssociation
{
	private BooleanSupplier supply;//Encapsulation
	private Consumer<String> consumer;
	private ObjIntConsumer<Byte> objConsume;
	
	
	public BooleanSupplierAssociation(BooleanSupplier supplier)
	{
		this.supply=supplier;
	}
	public BooleanSupplierAssociation(Consumer<String> consumer)
	{
		this.consumer=consumer;
		
	}
	public BooleanSupplierAssociation(ObjIntConsumer<Byte> objConsume)
	{
		this.objConsume=objConsume;
	}

	public void supplier() 
	{
		System.out.println("BooleanSupplier");
		boolean a=this.supply.getAsBoolean();
		
		if(a) 
			System.out.println("Yes!");
		else 
			  System.out.println("No!");
	}
	
	public void dance()
	{
		System.out.println("Consumer :");
		this.consumer.accept("jyothi");
	}
	
	public void walk()
	{
		System.out.println("ObjIntConsumer :");
		this.objConsume.accept((byte)60, 3);
	}
	
	
	
}
