package com.xworkz.PreDefineFI;

import java.util.function.Function;

public class FunctionAss
{
private Function<Integer, Double> function;

	public FunctionAss(Function<Integer, Double> function)
	{
		this.function=function;
	}
	public void slap()
	{
		System.out.println("Function:");
     System.out.println( this.function.apply(89));

	}
	

}
