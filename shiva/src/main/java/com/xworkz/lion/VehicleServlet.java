package com.xworkz.lion;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="vehicle",urlPatterns="/jump" ,loadOnStartup=1)
public class VehicleServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;
	
	public VehicleServlet()
	{
		System.out.println("no arg vehicle constructor");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String name=req.getParameter("name");
		String address=req.getParameter("address");
		String date=req.getParameter("date");
		String time=req.getParameter("time");
		String vehiclename=req.getParameter("vehiclename");
		String vehiclenumber=req.getParameter("vehiclenumber");
		String model=req.getParameter("model");
		String year=req.getParameter("year");
		String mileage=req.getParameter("mileage");
		String oilchange=req.getParameter("oilchange");
		String tirerotation=req.getParameter("tirerotation");
		String brake=req.getParameter("brake");
		String insurance=req.getParameter("insurance");
		
		String enginetuneup=req.getParameter("enginetuneup");
		String otherspecify=req.getParameter("otherspecify");
		String fulidtopup=req.getParameter("fulidtopup");
		String filterreplacement=req.getParameter("filterreplacement");
		
		String batterycheck=req.getParameter("batterycheck");
		String wheelalignment=req.getParameter("wheelalignment");
		String otherspecify1=req.getParameter("otherspecify");
		
		PrintWriter  writer=resp.getWriter();
		resp.setContentType("text/plain");
		writer.write("vehicleService application is processing");
		
		System.out.println("Name: "+name+ " ,address:"+address+ " ,date:"+date+" ,time:"+ time+ " ,vehiclename:"+vehiclename+" ,vehiclenumber"+vehiclenumber+" ,model:"+model+" ,year:"+year+" ,mileage:"+mileage+" ,oilchange: "+oilchange+" ,tirerotation"+tirerotation+" ,brake:"+brake+" ,year:"+year+" ,insurance:"+insurance+" ,enginetuneup: "+enginetuneup+" ,otherspecify:"+otherspecify+" ,fulidtopup:"+fulidtopup+" ,filterreplacement: "+filterreplacement+" ,batterycheck:"+batterycheck+" ,wheelalignment:"+wheelalignment+" ,otherspecify1: "+otherspecify1);
	

	}

}
