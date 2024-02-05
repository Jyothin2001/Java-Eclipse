
package com.xworkz.example;

import com.xworkz.example.things.Window;
import com.xworkz.example.things.WoodWindow;

public class Runner {

	public static void main(String[] args) 
	{
		Window win=new Window();
		win.open();
		win.close();
		win.semiClose();
		
		System.out.println("-------------------------");
		
		WoodWindow win1=new WoodWindow();
		win1.open();
		win1.close();
		win1.autoClose();
		
		System.out.println("-------------------------");
		
		Window win3=new WoodWindow();
		win3.open();
		win3.close();
		//win3.autoClose();
		win3.open();
		win3.close();
		win3.semiClose();
		
		System.out.println("-------------------------");
		
		WoodWindow win4=(WoodWindow)win3;
		
		win4.autoClose();
		
		
				
		
				

	}

}
