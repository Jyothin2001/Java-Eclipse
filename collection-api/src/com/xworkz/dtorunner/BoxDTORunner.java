package com.xworkz.dtorunner;

import java.util.Collection;
import java.util.Iterator;

import com.xworkz.dto.BoxDTO;

public class BoxDTORunner 
{
	
public static void main(String[] args) 
{
	
	Collection<BoxDTO> collection=BoxDTO.box();
		
	for(BoxDTO a:collection)
	{
		if(a.getColor().equals("Red"))
			System.out.println("Box with red color: "+a);
	}
	
	System.out.println("size before: "+collection.size());
	
	Iterator<BoxDTO> itr=collection.iterator();
	
           while(itr.hasNext())
           {
        	   BoxDTO a=itr.next();
        	   
        	   if(a.getColor().equals("Green"))
        		   itr.remove();

           }
           System.out.println("size after: "+collection.size());
           
	
	}
}
