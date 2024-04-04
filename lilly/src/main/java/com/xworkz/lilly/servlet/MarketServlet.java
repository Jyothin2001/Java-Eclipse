package com.xworkz.lilly.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/market" ,loadOnStartup = 1)
public class MarketServlet extends HttpServlet
{

	
	private static final long serialVersionUID = 1L;
	
	public MarketServlet()
	{
		
		System.out.println("no arg market constructor");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		
		String name=req.getParameter("name");
		String pincode=req.getParameter("pincode");
		String Area=req.getParameter("Area");
		String location=req.getParameter("location");
		String stall=req.getParameter("stall");
		String item=req.getParameter("item");
		String quality=req.getParameter("quality");
		String quantity=req.getParameter("quantity");
		String owner=req.getParameter("owner");
		String keb=req.getParameter("keb");
		String gst=req.getParameter("gst");
		String transaction=req.getParameter("transaction");
		String city=req.getParameter("city");
		String type=req.getParameter("type");
		String cost=req.getParameter("cost");
		
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("MarketResult.jsp");
		
		req.setAttribute("name", name);
		req.setAttribute("pincode", pincode);
		req.setAttribute("Area", Area);
		req.setAttribute("location", location);
		req.setAttribute("stall", stall);
		req.setAttribute("quality", quality);
		req.setAttribute("quantity", quantity);
		req.setAttribute("owner", owner);
		req.setAttribute("keb", keb);
		req.setAttribute("gst", gst);
		req.setAttribute("transaction", transaction);
		req.setAttribute("item", item);
		req.setAttribute("city", city);
		req.setAttribute("cost", cost);
		req.setAttribute("type", type);

		
		dispatcher.forward(req, res);
		
		

	}
	
	
	

}
