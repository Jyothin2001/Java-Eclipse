package com.xworkz.runner;

import com.xworkz.PreDefineFI.BooleanSupplierAssociation;
import com.xworkz.PreDefineFI.DoubleFunctionAss;
import com.xworkz.PreDefineFI.DoubleUnaryOperatorAss;
import com.xworkz.PreDefineFI.FunctionAss;
import com.xworkz.PreDefineFI.ToIntBiFunctionAss;
import com.xworkz.PreDefineFI.TolongBiFunctionAss;

public class PreDefineFIRunner 
{
   public static void main(String[] args) 
	{
		
		BooleanSupplierAssociation supplier=new BooleanSupplierAssociation(()->true);//implementation 
		 supplier.supplier();
		 
		 BooleanSupplierAssociation ref1=new BooleanSupplierAssociation((g)->
		 {
			 
			 if(g=="jyoti")
				 System.out.println("equal");
			 else
				 System.out.println("not equal");
		 });
		 ref1.dance();
		 
		 BooleanSupplierAssociation ref3=new BooleanSupplierAssociation((b,i)->
		 {
			 
			 int v=b/i;
			 System.out.println(v);
		 });
		  ref3.walk();
		 
//		 DoubleFunction<Double> a1=(d)->
//		 {
//			 System.out.println("s"+d);
//              int a=9;
//              double c=d+a;
//			return c; 
//		 };
//		 
//		 
////		 double k=a1.apply(166.86d);
////		 System.out.println(k);
//	 
//		 DoubleAssociation sa=new DoubleAssociation(a1);
//		 sa.function();
		 
	   DoubleFunctionAss aa=new DoubleFunctionAss((c)->
		{
			int a=10;
			double b=c;
			double s=a+b;
			return s;
		});
		aa.function();
		
		DoubleFunctionAss aa1=new DoubleFunctionAss(()->
		{
			boolean a=true;
			boolean b=false;
			boolean c=a==b;
			
			return c;
			
		});
		aa1.eat();
		

		 
		 DoubleUnaryOperatorAss ref=new DoubleUnaryOperatorAss((d)->
		 {
			 double num=4+d;
			 return num;

		 });
		 ref.run();
		
		 ToIntBiFunctionAss bi=new ToIntBiFunctionAss((num,num1)->
		 {
			 int a=num*num1;
			 return a;
			 
		 });
		 bi.jump();
	
		 ToIntBiFunctionAss bi1=new ToIntBiFunctionAss((a)->
		 {
			return a-1; 
		 });
		 bi1.walk();
		 
		 bi1.setAge(90);
		 System.out.println(bi1.getAge());
//		 hi.age=10;
//		 System.out.println(hi.age=10);
		 
		 TolongBiFunctionAss ref5=new TolongBiFunctionAss((s,i)->
		 {
			 Long b=(long)(s+i);
			 return b;
			 
		 }) ;
		 ref5.run();
		 
		 FunctionAss fun=new FunctionAss((i)->
		 {
			 return i+10d;
		 });
		 fun.slap();
		  
	}
}
