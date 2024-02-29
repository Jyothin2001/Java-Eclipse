package com.xworkz.exception;

public class Bottle 
{
	public void jump()
	 {
		 System.out.println("jump method : before exception");
		 store();
	 }
	
	public void store()
 {
	 int number=9;
	 int number2=0;
	 int result=0;
	 
	 try 
	 {
	 result=number/number2;
	 System.out.println("result is  : "+result);
	 }
	 catch(ArithmeticException e) //runTimeException
	 {
         e.printStackTrace(); 
		 //System.err.println(e.toString());
		// System.err.println(e.getMessage());
        System.out.println("catch: give number greater than zero");
	 
	 }
	 run();
	 
	}
	
 
 
 public void run()
 {
	 System.out.println("run method: after exception");
	 
 }
 
 
}
