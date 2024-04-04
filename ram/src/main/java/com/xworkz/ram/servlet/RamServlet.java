package com.xworkz.ram.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="ram" ,urlPatterns="/click" ,loadOnStartup=1)
public class RamServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;
	
	public RamServlet()
	{
		System.out.println("no-args constructor");
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		res.setContentType("text/plain");
		
		PrintWriter write=res.getWriter();
		write.write("its done");
		
	}

}
