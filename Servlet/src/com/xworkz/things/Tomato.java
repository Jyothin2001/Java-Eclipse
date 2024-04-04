package com.xworkz.things;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="hello" ,urlPatterns="/tomato" ,loadOnStartup=1)
public class Tomato extends HttpServlet
{
private static final long serialVersionUID = 1L;
	
	public  Tomato()
	{
		System.out.println("no param = construction is mandatory to create an object for servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		System.out.println("override service method Tomato");
		System.out.println("IP address: "+ req.getRemoteAddr());

	}


}
