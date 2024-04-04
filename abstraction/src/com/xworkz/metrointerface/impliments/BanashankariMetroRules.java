package com.xworkz.metrointerface.impliments;

import com.xworkz.metrointerface.MetroRules;

public class BanashankariMetroRules implements MetroRules
{
	@Override
public int buyTicket()
{
	System.out.println("buy tickets banashankari");
	
	return 1;
}

@Override
public boolean cleaniness() 
{
	System.out.println(" clean ness");
	return true;
}

@Override
public boolean excessLuggege()
{
	System.out.println("excess luggege");
	return true;
}

@Override
public String getLine() 
{
	System.out.println("greencolor:");
	return MetroRules.GREEN_LINE;
}

@Override
public String getLine1()
{
	
	System.out.println("yellowcolor:");
	return MetroRules.YELLOW_LINE;

}
	
	
	
	
	
	
}
