package com.xworkz.dtorunner;

import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.dto.MarkerDTO;

public class MarkerDTORunner
{

	public static void main(String[] args)
	{
     LinkedList<MarkerDTO> collection=MarkerDTO.marker();
     Iterator<MarkerDTO> itr=collection.iterator();
     
     while(itr.hasNext())
     {
    	 MarkerDTO a= itr.next();
    	 
    	 if(a.getBrand().endsWith("l"))
    		 System.out.println("ends with l: "+a);
    		 
    		 
     }
     
     System.out.println("------------------------------------------------------------------");
     
     Iterator<MarkerDTO> itr1=collection.iterator();
     
     while(itr1.hasNext())
     {
    	 MarkerDTO a= itr1.next();
    	 
    	 if(a.getBrand().startsWith("s"))
    		 System.out.println("starts with S: "+a);
    		 
    		 
     }

	}

}
