package com.xworkz.things;


//multithreading comes from java.lang pacakage .
//-it is a class in java..-
//every thread has id and name by default(jvm provide) -also create our own thread name.
//main is the name of the main method given by java(interview question) and only one thread by default
//no gaurantee that thread id is always comes in consequtive(order) - 0 to n
// every thread has priority ranges from 1 to 10 (1-min priority, 5-normal,10-max)

//new keyword thread is created not running(explicitly type start())
//thread kill after its execution
//time sharing mechanism -allocate time for each thread by jvm and cpu
// four ways to create thread 1 way=extends , 2nd way=implements Runnable interface,3rd=anonymous,4th=lamda expressions
//why we need another way? extends only one class but we can implements multiple interface class.


//0-new
//1-runnable
//2-blocked(sychronization)
//3-waiting(join)
//4-timed waiting(sleep)
//5-teminated

//knowledge purpose and interview point and multi threading bug  

public class MultiThreading 
{

	public static void main(String[] args) throws InterruptedException 
	{

		
	Animal ani=new Animal();
	Thread t=new Thread(ani);
	t.start();


		
     	Dog dog =new Dog();
     	Thread t1=new Thread(dog,"jj");
     	t1.start();
////		Thread t1=new Thread(dog,"j");
//		t1.start();
//		System.out.println(Thread.activeCount());
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.activeCount());
//		System.out.println(Thread.currentThread().getId());
//		System.out.println(Thread.currentThread().getPriority());
//		
		
//		Animal ani1=new Animal();
//		 Thread t2=new Thread(ani1);
//		t2.start();
//		
//		
//		Dog dog1=new Dog();
//		 Thread t4=new Thread(dog1);
//		t4.start();
//
//		//Animal ani=new Animal();
//		//Thread th=new Thread(ani,"hgf");
//		
//  	     //th.start();
//	
//        System.out.println(Thread.activeCount());
//        
//        
//        //Thread t=new Dog();
//        System.out.println(t.getState());
//       // t.start();
//       System.out.println(t.getState());
//       // System.out.println(Thread.activeCount());
//        //t.join();
//       t.sleep(5000);
//        System.out.println(t.getState());
//        
//        
//        
//        //Thread t1=new Animal();
//        //t1.start();
//        System.out.println(Thread.activeCount());
//        System.out.println(t.getState());
        
 
	}

}

