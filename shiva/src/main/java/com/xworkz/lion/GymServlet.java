package com.xworkz.lion;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="gymserv" ,urlPatterns="/gym" ,loadOnStartup=1)
public class GymServlet extends HttpServlet 
{
private static final long serialVersionUID = 1L;

  public GymServlet()
{
	System.out.println("no-arg Gym Constructor");
}
    @Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {
    	String name=req.getParameter("name");
    	String age=req.getParameter("age");
    	String gender=req.getParameter("gender");
    	String number=req.getParameter("number");
    	String EmergencyNumber=req.getParameter("Emnumber");
    	String allergies=req.getParameter("allergies");
    	
    	
    	
        //response
		res.setContentType("text/plain");
		 PrintWriter write=res.getWriter();
		 write.write("Gym Application under Processing..");
	}

}
