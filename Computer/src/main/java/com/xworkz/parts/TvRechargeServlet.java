package com.xworkz.parts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="hello", urlPatterns ="/tv", loadOnStartup = 1)
public class TvRechargeServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;
	public TvRechargeServlet()
	{
		System.out.println("no arg tv constructor");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String id=req.getParameter("Id");
		String type=req.getParameter("type");
		String amount=req.getParameter("amount");
		String vendor=req.getParameter("vendor");
		String accept=req.getParameter("accept");
		
		System.out.println("Coustomer id: "+id);
		System.out.println("type:"+type);
		System.out.println("amount:"+amount);
		System.out.println("vendor:"+ vendor);
		System.out.println("accept:"+accept);
		
		
		
		
		
		
	
		resp.setContentType("text/html");
	    PrintWriter writer=resp.getWriter();
	    
	    
	    writer.write("<html>");
		writer.write("<head>");
		writer.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">");
		
		writer.write("</head>");
		
		writer.write("<body>");
		writer.write("<div>");
		
		writer.write("<div align=\"center\">");
		
		writer.write("<nav class=\"navbar navbar-light \" style=\"background-color: #e3f2fd;\"><div class=\"container-fluid\"> "
				+"<div class=\\navbar-header\\\">"
				+ "<a class=\" btn btn-primary navbar-brand\" href=\"index.html\">Home</a>"
				+ "<a class=\" btn btn-primary navbar-brand\" href=\"TvRecharge.html\">Form</a>");
		writer.write("</div");
				writer.write("</div>");
		writer.write("</nav>");
		writer.write("</div>");

		
	    writer.print("<b>Tv Recharge is Successfull....</b><br><br>");
	    
	    writer.print("<b>....Details ....</b><br>");
	    writer.write("<b>Coustomer id: </b>"+id+ "<br>");
	    writer.write("<b>type: </b>"+type +"<br>");
		writer.println("<b>amount:  </b>"+amount+ "<br>");
		writer.write(" <b>vendor:  </b>"+ vendor+ "<br>");
		writer.write("<b>accept:  </b>"+accept+"<br>");
		writer.write("</body>");
		writer.write("</html>");
		
		
	}

}
