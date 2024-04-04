package com.xworkz.things;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="Chilli" ,urlPatterns="/chilli" ,loadOnStartup=1)
public class Chilli extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	public  Chilli()
	{
		System.out.println("no param = construction is mandatory to create an object for servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		System.out.println("override service method Chilli");
		System.out.println("IP address: "+ req.getRemoteAddr());

	
	    res.setContentType("text/plain");
	    //res.setContentLength(1);
	    PrintWriter write=res.getWriter();
	    write.print("this is the my first response text from service");
	}

}
