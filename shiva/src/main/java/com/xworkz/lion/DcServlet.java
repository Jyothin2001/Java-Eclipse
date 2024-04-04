package com.xworkz.lion;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="deadperson" ,urlPatterns="/walk",loadOnStartup=1)
public class DcServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;
	
	public DcServlet()
	{
		System.out.println("no args Dead person constructor");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String dateofdeath=req.getParameter("dateofdeath");
		String  father= req.getParameter("father");
		String  mother= req.getParameter("mother");
		String  cause= req.getParameter("cause");
		String  applicant= req.getParameter("applicant");
		String  permanentaddress= req.getParameter("permanentaddress");
		String  gender= req.getParameter("gender");
		String  placeofbirth= req.getParameter("placeofbirth");
		
			PrintWriter writer=resp.getWriter();
			resp.setContentType("text/plain");
			writer.write("The Death certificate is currently being processed....");
			System.out.println("Name: "+name+ " ,age:"+age+ " ,date of death:"+dateofdeath+" ,Father:"+ father+ " ,Mother:"+mother+" ,cause"+cause+" ,applicant:"+applicant+" ,permanent address:"+permanentaddress+" ,gender:"+gender+" ,placeofbirth: "+placeofbirth);
	}
}
