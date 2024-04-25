package com.xworkz.runner;

import java.util.Collection;
import java.util.Iterator;

import com.xworkz.methods.Passbook;

public class PassbookNumber 
{

	public static void main(String[] args)
	{
        Collection<Long> passbook=Passbook.getPassbook();
        Iterator<Long> book=passbook.iterator();  
        
	}

}

		Collection<Long> collection=PassBookNumber.getPassBookNo();
		//int countStartWithFour=0;
		for(Long pb:collection)
		{
			String passbook=String.valueOf(pb);
			
			if(passbook.startsWith("4"))
			{
				System.out.println("pass book numbers starts with 4:"+passbook);
				
			}
			if(passbook.contains("0"))
			{
				System.out.println("whose numbers having '0':"+passbook);
			}
	
			
		}
		
 
	}

}
