package com.xworkz.PreDefineFI;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorAss 
{

	private DoubleUnaryOperator unary;
	
	
	
	public DoubleUnaryOperatorAss(DoubleUnaryOperator unary2) 
	{
		this.unary=unary2;
	}


	public void run()
	{
		System.out.println("DoubleUnaryOperator:");
		double a=this.unary.applyAsDouble(200.8d);
		System.out.println(a);
		}
}
