package com.xworkz.PreDefineFI;

import java.util.function.LongUnaryOperator;
import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionAss 
{
	private ToIntBiFunction<Integer, Byte> bi;
	
	private LongUnaryOperator hi;
	
	private int age1;

	public ToIntBiFunctionAss(ToIntBiFunction<Integer, Byte> bi) {
		this.bi = bi;
	}

	public int getAge() {
		return age1;
	}

	public void setAge(int age) {
		this.age1 = age;
	}

	public ToIntBiFunctionAss(LongUnaryOperator hi) {
		this.hi = hi;
	}

	public void jump() {
		System.out.println("ToIntBiFunction:");
		System.out.println(this.bi.applyAsInt(45, (byte) 10));

	}

	public void walk() {
		System.out.println("LongUnaryOperator:");
		System.out.println(this.hi.applyAsLong(123456780));
	}
}
