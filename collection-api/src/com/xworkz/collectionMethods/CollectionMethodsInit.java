package com.xworkz.collectionMethods;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethodsInit
{

	public static Collection<BookDTO> run()
	{
		
		BookDTO obj=new BookDTO("Believe in yourself",(short)80,"Dr.Joseph Murphy",105,(short)1995,"Penguin Random House and JMW Group","Inspiring and aascinating ");
		BookDTO obj1=new BookDTO("The Girl On The Train",(short)199,"Ruskin Bond ",199,(short)2022,"Rupa Publication india pvt Ltd.","Essays and short stories");
	    BookDTO obj2=new BookDTO("Think and Grow rich",(short)144,"Nepoleon Hill ",199,(short)1937,"The ralston society","Personal development. ");
        BookDTO obj3=new BookDTO("Energise your mind. ",(short)240,"Rupa",224,(short)2023. ,"Rupa","Self help book.  ");
		
	    
		Collection<BookDTO> collection=new ArrayList<BookDTO>();
		collection.add(obj);
		collection.add(obj1);
		collection.add(obj2);
		collection.add(obj3);
		
		return collection;
		
	}
}
