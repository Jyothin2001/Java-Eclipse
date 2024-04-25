package com.xworkz.dtorunner;

import java.util.ArrayList;
import java.util.Iterator;

import com.xworkz.dto.PerfumeDTO;

public class PerfumeDTORunner 
{
	public static void main(String[] args) 
	{
		ArrayList<PerfumeDTO> collection=PerfumeDTO.perfume();
		Iterator<PerfumeDTO> itr=collection.iterator();
		
		System.out.println("size befor: "+collection.size());
		
		while(itr.hasNext())
		{
			PerfumeDTO a=itr.next();
			
			//if(a.getColor().equalsIgnoreCase("pink") && a.getCost()==100)//values are in same line/reference
			if(a.getColor().equalsIgnoreCase("pink"))
			{
			     itr.remove();
				System.out.println("removed based on Color: "+a);
			}
			
		}
		System.out.println("size after: "+collection.size());
		
		
		System.out.println("----------------------------------");
		
		
		System.out.println("size befor: "+collection.size());
		
		Iterator<PerfumeDTO> itr1=collection.iterator();//two iterator object is to create if you want loop twice
		                                                //and also not affect the original collection create another collection reference
		while(itr1.hasNext())
		{
			PerfumeDTO a=itr1.next();
			
			if(a.getCost()==100)
			{
				itr1.remove();
				System.out.println("removed based on cost: "+a);
			}
			
		}
		System.out.println("size 1 after: "+collection.size());

		
	}

}
