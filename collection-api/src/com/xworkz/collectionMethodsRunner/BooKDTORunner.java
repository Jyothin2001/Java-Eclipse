package com.xworkz.collectionMethodsRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;

import com.xworkz.collectionMethods.BookDTO;
import com.xworkz.collectionMethods.CollectionMethodsInit;

public class BooKDTORunner {

	public static void main(String[] args) 
	{
		Collection<BookDTO> book=CollectionMethodsInit.run();
		
		
		
		
        System.out.println("----------------add()-----------------------------------");
		
        for(BookDTO a1: book)
	    {
	    	System.out.println(a1);
	    }
	    
        System.out.println("----------------------------------");
        
        
		
		Collection<BookDTO> collection1=new ArrayList<BookDTO>();
		
		BookDTO obj4=new BookDTO("You only live once. ",(short)240,"Stuti changle. ",170,(short)2021 ,"Rupa Publication india pvt Ltd","Fictional story.  ");
		collection1.add(obj4);
		collection1.add(new BookDTO("Something I never told you.",(short)98,"Shravya Bhinder ",224,(short)2019 ,"Rupa Publication india pvt Ltd","Romance novel,Fiction"));
		collection1.add(new BookDTO(" (first place bcz it consider space )The art of letting go. ",(short)100,"Sahita Baruan  ",164,(short)2018. ,"Originally published. ","The Art  helps you understand "));
      collection1.add(new BookDTO("You only live once",(short)240,"Stuti changle. ",170,(short)1955 ,"Rupa","Fictional story"));
		
		for(BookDTO a1: collection1)
	    {
	    	System.out.println(a1);
	    }
	    
		
		
		
		
		
		
		
		
		System.out.println("----------------addAll()-----------------------------------");
		
		boolean a= collection1.addAll(book);  //we have two collection add 
		                                      //one collection elements in another collection use addAll()
	    System.out.println("addAll() returns: "+a);
	    
	    for(BookDTO a1: collection1)
	    {
	    	System.out.println(a1);
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    System.out.println("----------------size()-----------------------------------");
	    
	    System.out.println("size: "+ collection1.size());
	    
	    System.out.println("----------------stream() and forEach()-----------------------------------");
	    
	    collection1
	    .stream()
	    .sorted()
	    .forEach(b->System.out.println(b));
	    
	    
	    
	    
	    
	    
	    
	    
	    System.out.println("----------------contains()-----------------------------------");
	    
	    BookDTO temp1=new BookDTO("You only live once",(short)240,"Stuti changle. ",170,(short)1955 ,"Rupa","Fictional story");
	   boolean n= collection1.contains(temp1);
	   System.out.println("contains: "+n);
	   
//      Iterator<BookDTO> ll=collection1.iterator();
//      
//      while(ll.hasNext())
//      {
//    	  BookDTO h=ll.next();
//    	   if(h.getPublishedYear()==1955)
//    	   {
//    		   Boolean n=collection1.contains(temp1);
//    		   System.out.println(n);
//    	   }
//      }
	   
	   
	   
	   
	   
	   
	   
	   
	   
   
	   
	   System.out.println("----------------containsAll()-----------------------------------");

	   
	   Boolean d1=collection1.containsAll(book);
	   System.out.println(d1);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	    System.out.println("----------------iterator()-----------------------------------");
	    
	    Iterator<BookDTO> itr=collection1.iterator();
	    
	    
         while(itr.hasNext())
         {
        	 BookDTO d= itr.next();
        	 
        	 if(d.getPrice()==d.getNoOfPages())
        	     System.out.println(d);
        		 
        	 else if(d.getPublishedYear()==1955)
                 System.out.println(d);
         }
         
         
         
         
         
         
         
         
         
         
         
         System.out.println("------------()----spliterator()-----------------------------------");
         /*
          * Iterator can be used to traverse only Collection types.
          *  But using Spliterator , you can traverse collections, arrays, and streams.
          *   Size of the Iterator is always unknown. 
          *   But, Spliterator can provide you the exact size
          *    ( getExactSizeIfKnown() method) or at least an estimate size ( estimateSize() method).
          */
         Spliterator<BookDTO> split=collection1.spliterator();
        
         Long g= split.estimateSize(); //give size ?
        System.out.println(g);
        
       int f=split.characteristics();
       System.out.println(f);  //16464 ?
       
       
        
        for(BookDTO a1: collection1)
	    {
	    	System.out.println(a1);
	    }
	    
     
        
        
        
        
        
        
        
        
        
         
         System.out.println("----------------isEmpty()-----------------------------------");

        System.out.println( collection1.isEmpty());  //returns true if collection  is empty otherwise false
        
        System.out.println(collection1);
        
        
        
        
        
        
        
        
        
         
         System.out.println("--------------()--toArray()-----------------------------------");
         
      Object[] ob=collection1.toArray();
      
      System.out.println("to array: "+ ob);  //[Ljava.lang.Object;@87aac27
     	  
      System.out.println("to obj: "+ Arrays.toString(ob)); // gives in array form
      System.out.println("to int: "+ Arrays.toString(ob));  
       
      
      
      
      
      
      
      
      
      
      
      
      
      System.out.println("----------------hashcode()-----------------------------------");
         
     int k= collection1.hashCode();
     System.out.println(k);  // gives negative number
     int k1= collection1.hashCode() & Integer.MAX_VALUE;
     System.out.println(k1); // but gives different number?
     
     
     
     
     
     
     
     
     
     
     
     
     
     System.out.println("----------------retainAll()-----------------------------------");
     
     System.out.println("size before :"+collection1.size());
     
     for(BookDTO a1: collection1)
	    {
	    	System.out.println(a1);
	    }
	   
//   boolean u=  collection1.retainAll(book);   //delete all elements but not duplicates
//   System.out.println(u);
//   
   
   for(BookDTO a1: collection1)
   {
   	System.out.println(a1);
   }
  
     System.out.println("size after:"+collection1.size());
     
     
     
     
     
     
     
     
     
     
     
     System.out.println("----------------remove()-----------------------------------");
     
     System.out.println("size before :"+collection1.size());
     
     for(BookDTO a1: collection1)
     {
     	System.out.println(a1);
     }
     System.out.println("------------------");
     
     BookDTO temp=new BookDTO("You only live once",(short)240,"Stuti changle. ",170,(short)2021 ,"Rupa","Fictional story");
   
     boolean re= collection1.remove(temp);  //remove based on overridden(equals) condition
    System.out.println(re);
    
    
     
System.out.println("size after collection1:"+collection1.size());
    
    for(BookDTO a1: collection1)
    {
    	System.out.println(a1);
    }
    
     
     
     
     
     
     
     
     
  System.out.println("----------------removeAll()-----------------------------------");
     
  System.out.println("size before :"+collection1.size());
  
  for(BookDTO a1: collection1)
  {
  	System.out.println(a1);
  }
  System.out.println("------------------");
  
  System.out.println("size before :"+book.size());
  
  for(BookDTO a1: book)
  {
  	System.out.println(a1);
  }
  
  
  
    boolean re1=collection1.removeAll(book); // remove specified(reference)  all elements
System.out.println(re1);                     //++will not remove twice(repeated element)++
    
    System.out.println("size after collection1:"+collection1.size());
    
    for(BookDTO a1: collection1)
    {
    	System.out.println(a1);
    }
    
    
    System.out.println("size before book:"+book.size());
     
     
     
     
     
     
     
     
     
    System.out.println("----------------removeIf()-----------------------------------");
    
    collection1.removeIf(n1->n1.getPublishedYear()==1955); //condition
    
    for(BookDTO a1: collection1)
    {
    	System.out.println(a1);
    }
    
    
    System.out.println("----------------clear()-----------------------------------");
    
    System.out.println("size before book:"+collection1.size());
    
    collection1.clear();
    
    System.out.println("size after book:"+collection1.size());
   
    
    
    
    
	}

}
