package com.xworkz.runner;

import java.util.Collection;
import java.util.Iterator;

import com.xworkz.methods.Message;

public class MessageRunner 
{

	public static void main(String[] args)
	{
      Collection<String> collection=Message.messageCollection();

      
      System.out.println("size Before:"+collection.size());
      
      for(String a:collection)
      {
    	  System.out.println(a);
      }
      
      Iterator<String> iterator=collection.iterator();
      
     while(iterator.hasNext()) //return boolean
      {
    	  String itr=iterator.next();
    	  
    	  if(itr.length()>30)
    	  {
    		  
    		  iterator.remove();
    		  System.out.println(itr);
    		  
    	  }
    	  itr= itr.replaceAll("[^a-zA-Z0-9]"," ");//replaceAll() from string method
     	 System.out.println("after removing special charectors: "+itr);
     	 
     	
      }
     
      
      System.out.println("size after:"+collection.size());
      
      
      System.out.println("--------------mkk----------------------------------------------------------------");
      
//      while(iterator.hasNext())
//      {
//    	  String itr=iterator.next();
//    	  
//    	 itr= itr.replaceAll("[^a-zA-Z0-9]","J");
//    	 System.out.println("after removing special charectors: "+itr);
//    			  
//      }


	}

}





































