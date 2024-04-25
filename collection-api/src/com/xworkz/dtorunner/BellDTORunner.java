package com.xworkz.dtorunner;

import java.util.Collection;
//import java.util.Iterator;

import com.xworkz.dto.BellDTO;

public class BellDTORunner 
{

	public static void main(String[] args) 
	{
		Collection<BellDTO> collection=BellDTO.bell();
		
       for(BellDTO b:collection)
       {
    	  if(b.getPrice()>1000)
    		  System.out.println("price > 1000: "+b);
//    	  else
//    		  System.out.println("not");
    	  
       }
       
       System.out.println("--------------------------------------------");
       
       for(BellDTO b:collection)
       {
    	   //String a="Bronze";
   	   if(b.getMetal().equals("Bronze"))
   			   System.out.println("bronze: "+b);
   	    
       }
       System.out.println("--------------------------------------------");
       
       for(BellDTO b:collection)
       {
    	   if(b.getHeight()==b.getWeight()) //equals() for string
    			   System.out.println("Height and weight matching bells are: "+b);
    	  
       }
       
       
     // we also get output via Iterator
//       Iterator<BellDTO> itr=collection.iterator();
//       
//       while(itr.hasNext())
//       {
//    	   BellDTO a =itr.next();
//    	   if(a.getMetal().equals("Bronze"))
//    			   System.out.println("bronze: "+a);
//    	   
//       }
       {
    	   
    	  
    	   
       }
       
       
	}
}


