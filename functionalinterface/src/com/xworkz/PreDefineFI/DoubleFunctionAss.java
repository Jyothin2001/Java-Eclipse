package com.xworkz.PreDefineFI;

import java.util.function.DoubleFunction;
import java.util.function.Supplier;

public class DoubleFunctionAss
{
private DoubleFunction<Double> fun;
private Supplier<Boolean> supplier;

public DoubleFunctionAss(DoubleFunction<Double> fun)
{
	this.fun=fun;
}
public DoubleFunctionAss(Supplier<Boolean> supplier)
{
	this.supplier=supplier;
}


public void function()
{
	System.out.println("DoubleFunction:");
	Double value=this.fun.apply(20.7d);
    if(value>30)
		System.out.println("add one digit: "+(value+1));
	else
		System.out.println("minus one digit: "+ (value-1));


	
}
public void eat()
{
	System.out.println("Supplier:");
	Boolean a=this.supplier.get();
	if(a)
		System.out.println("yes");else System.out.println("no");
	
}

}