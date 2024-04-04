package com.xworkz.things;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="Carrot" ,urlPatterns="/carrot" ,loadOnStartup=1)
public class Carrot extends HttpServlet
{
	
	private static final long serialVersionUID = 1L;

		public  Carrot()
		{
			System.out.println("no param = construction is mandatory to create an object for servlet");
		}
		
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
		{
			System.out.println("override service method carrot");
			System.out.println("IP address: "+ req.getRemoteAddr());
			
		res.setContentType("i");

		}
		

}

