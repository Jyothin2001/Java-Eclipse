package com.xworkz.parts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/college", loadOnStartup = 1)
public class CollegeServlet extends HttpServlet

{
	private static final long serialVersionUID = 1L;
	public CollegeServlet()
	  {
		  System.out.println("no-arg college constructor");
	  }
	  @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	  {
		  //data 
		  String name=req.getParameter("name");
		  String phone=req.getParameter("phone");
		  String department=req.getParameter("department");
		  String subject=req.getParameter("subject");
		  String payment=req.getParameter("payment");
		  String accept=req.getParameter("accept");
		  
		  
		  //response
		resp.setContentType("text/html");
		PrintWriter write1=resp.getWriter();
		
		
		//console
		System.out.println("name: "+name);
		System.out.println("phone:"+phone);
		System.out.println("subject:"+subject);
		System.out.println("department:"+ department);
		System.out.println("payment:"+payment);
		System.out.println("accept"+accept);
		
		//wrapper classes and type conversion
		//Integer lg=Integer.valueOf(cost);//non-primitive to non-primitive number
		//int intCost =Integer.parseInt(cost);  //non-primitive to primitive number called Auto Un-boxing
		//int intQuantity=Integer.parseInt(quantity);
		
		//int total=intCost*intQuantity;
		
		//System.out.println("cost is: "+total);//console
		
		
		write1.write("<html>");
		write1.write("<head>");
		write1.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">");
		write1.write("</head>");
		
		write1.write("<body>");
		write1.write("<div>");
		
		write1.write("<div align=\"center\">");
		write1.write("<nav class=\"navbar navbar-light \" style=\"background-color: #e3f2fd;\"><div class=\"container-fluid\"> "
				+"<div class=\\navbar-header\\\">"
				+ "<a class=\" btn btn-primary navbar-brand\" href=\"index.html\">Home</a>"
				+ "<a class=\" btn btn-primary navbar-brand\" href=\"college.html\">Form</a>");

		write1.write("</div>");
		write1.write("</div>");
		write1.write("</nav>");
		write1.write("</div>");
		write1.write("<b>Student Details under processing...</b>");

		
		write1.write("</div>");
		write1.write("</body>");
		write1.write("</html>");
		
		
		

				
					
		}


}
