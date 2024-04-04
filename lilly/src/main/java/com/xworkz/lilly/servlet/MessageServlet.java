package com.xworkz.lilly.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns ="/clg" , loadOnStartup=1)
public class MessageServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	
	public MessageServlet()
	{
		System.out.println("no args message constructor");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String msg=req.getParameter("msg");
		System.out.println(msg);
		
		RequestDispatcher dispatcher  = req.getRequestDispatcher("message.jsp");
		req.setAttribute("name", msg);
		dispatcher.forward(req, resp);
		
		}
}
