package com.xworkz.metrointerface;

public interface MetroRules 
{
	//interface connect to class, one cls is implements another cls association
	String GREEN_LINE="green";// "variables=constant" another name for final and static
	String YELLOW_LINE="yellow";//final variable always be initialize and cant change values
	String PURPLR_LINE="purple";//you want to get this  variable ,call in method
	
	boolean cleaniness(); //methods always contain public abstarct and no body is called abstract method
	boolean excessLuggege();
	int buyTicket();
	String getLine();
	String getLine1();
	
	
	

}
