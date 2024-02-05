package com.xworkz.example.things;

public class WoodWindow extends Window
{
	public WoodWindow()
	{
		System.out.println("sub class defalut runner");
	}
	
	@Override
	public void open()
	{
		System.out.println("sub class:open");
		
	}
	@Override
	public void close()
	{
		System.out.println("sub class:close");
		
	}

	public void autoClose()
	{
		System.out.println("sub class:autoclose");
		
	}

}
