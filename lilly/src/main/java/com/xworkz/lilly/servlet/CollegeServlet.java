package com.xworkz.lilly.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/college" ,loadOnStartup=1)
public class CollegeServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;
	
	public CollegeServlet()
	{
		System.out.println("no-arg constructor of college");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String college=req.getParameter("college");
		String degree=req.getParameter("degree");
		String stream=req.getParameter("stream");
		String percentage=req.getParameter("percentage");
		
		System.out.println("name: "+name);
		System.out.println("email:"+email);
		System.out.println("college:"+college);
		System.out.println("degree:"+ degree);
		System.out.println("stream:"+stream);
		System.out.println("percentage:"+percentage);
		
		
		

		
		RequestDispatcher dispatcher  = req.getRequestDispatcher("result.jsp");
		
		req.setAttribute("name", name);
		req.setAttribute("email", email);
		req.setAttribute("college", college);
		req.setAttribute("degree", degree);
		req.setAttribute("stream", stream);
		req.setAttribute("percentage", percentage);
		
		dispatcher.forward(req, resp);
		
		
		
	}
	
}
