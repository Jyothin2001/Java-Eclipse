package com.xworkz.runner;

import com.xworkz.ass.FestivalCheck;

public class runner 
{

	public static void main(String[] args) 
	{
		FestivalCheck fest=new FestivalCheck((String i,String b)->false);//
           fest.check();
           
           System.out.println("after main");//implicit declaration 
          String msg="agter main";
          System.out.println(msg);//explicit ->passing reference
           
	
	}

}
