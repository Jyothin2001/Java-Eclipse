package com.xworkz.things;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="Onions" ,urlPatterns="/onion" ,loadOnStartup=1)
public class Onion extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	public Onion()
	{
		System.out.println("no param = construction is mandatory to create an object for servlet");
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse respond) throws ServletException, IOException 
	{
		System.out.println("override service method in onion");
		
		System.out.println("IP address: "+ request.getRemoteAddr());


	}

}
