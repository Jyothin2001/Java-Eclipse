package com.xworkz.things;

public class DcMotor extends Motor
{
	@Override
   public void start()
   {
		System.out.println("start");
   }
	
	@Override
	   public void stop()
	   {
			System.out.println("stop");
	   }
   
}
