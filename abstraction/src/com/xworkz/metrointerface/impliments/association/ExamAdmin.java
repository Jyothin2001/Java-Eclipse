package com.xworkz.metrointerface.impliments.association;

import com.xworkz.metrointerface.ExamRule;


public class ExamAdmin 
{
	
	ExamRule exam;
	
	public ExamAdmin(ExamRule exam)
	{
		
		System.out.println("exam admin constructor");
		this.exam=exam;
		
	}

      public void hallTicket1() 
	{
    	  if(exam!=null)
    	  {
		System.out.println("association,hallticket: "+exam.hallTicket());
    	  }
		
	}

	public void invigilator1()
	{
		System.out.println("association,invigilator :"+exam.invigilator());	
		
	}

	public void duration1() 
	{
		System.out.println("association,duration: "+exam.duration());	
		
	}
	public void getName1() 
	{
		System.out.println("association,Name: "+exam.getName());	
		
	}
	

}
