package com.xworkz.runner;

import java.util.Collection;
import java.util.Iterator;

import com.xworkz.methods.VoterId;

public class VoterIdRunner 
{
	public static void main(String[] args)
	{
		Collection<Integer> collection=VoterId.voterNumbers();
		Iterator<Integer>voter=collection.iterator();
		
		
		while(voter.hasNext())
		{
			Integer a=voter.next();
			if(a.equals(475432))
				{
				System.out.println("With duplicates: "+collection.size());
				voter.remove();
				
				System.out.println("without duplicates: "+a);
				
				
				}
				
			
			
		}
		
		
	}

//		Collection<Integer> collection=VoterIds.getVoterIds();
//		Iterator<Integer> itr=collection.iterator();
//		
//		while(itr.hasNext())
//		{
//			Integer id =itr.next();
//			
//			if(id.equals(456378))
//			{
//				System.out.println("no of voterids before remove:"+collection.size());
//				
//				itr.remove();
//				
//				System.out.println("no of voterids after remove:"+collection.size());
//				
//			}
//		}

	}


