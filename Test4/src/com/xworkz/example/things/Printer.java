package com.xworkz.example.things;

public class Printer 
{
    public Printer()
    {
    	System.out.println("without invoke it display :default constructor");
    	
    }
    
    
    public void print()
    {
    	System.out.println("parent : print");
    }
    
    public void scan()
    {
    	System.out.println("parent : scan");
    }
    
    public void copy()
    {
    	System.out.println("parent : copy");
    }
}
