package com.xworkz.metrointerface.impliments.association.runner;

import com.xworkz.metrointerface.ExamRule;
import com.xworkz.metrointerface.impliments.UpscExamRule;
import com.xworkz.metrointerface.impliments.association.ExamAdmin;

public class ExamRuleRunner 
{

	public static void main(String[] args) 
	{
	ExamRule rule=new UpscExamRule();
	
	
      ExamAdmin admin=new ExamAdmin(rule);
      admin.duration1();
      admin.hallTicket1();
      admin.invigilator1();
      admin.getName1();
	}

}
