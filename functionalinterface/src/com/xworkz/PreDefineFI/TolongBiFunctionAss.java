package com.xworkz.PreDefineFI;

import java.util.function.ToLongBiFunction;

public class TolongBiFunctionAss 
{

	private ToLongBiFunction<Float, Integer> bi;
	
	public TolongBiFunctionAss(ToLongBiFunction<Float, Integer> bi)
	{
		this.bi=bi;
	}
	
	public void run()
	{
		System.out.println("To long Bi FunctionAss");
		System.out.println(this.bi.applyAsLong(19.76f, 10));
	
	}
	
}
