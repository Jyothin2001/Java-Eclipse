package com.xworkz.parts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="hi",urlPatterns = "/computer", loadOnStartup = 1)
public class ComputerServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;
  public ComputerServlet()
  {
	  System.out.println("no-arg computer constructor");
  }
  @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
  {
	  //data 
	  String brand=req.getParameter("brand");
	  String model=req.getParameter("model");
	  String color=req.getParameter("color");
	  String generation=req.getParameter("generation");
	  String type=req.getParameter("type");
	  String processor=req.getParameter("processor");
	  String ram=req.getParameter("ram");
	  String hard=req.getParameter("hard");
	  String motherboard=req.getParameter("motherboard");
	  String cache=req.getParameter("cache");
	  String cost=req.getParameter("cost");
	  String quantity=req.getParameter("quantity");

	  
	  //response
	resp.setContentType("text/html");
	PrintWriter write1=resp.getWriter();
	
	
	//console
	System.out.println("brand: "+brand);
	System.out.println("model:"+model);
	System.out.println("color:"+color);
	System.out.println("generation:"+ generation);
	System.out.println("type:"+type);
	System.out.println("processor"+processor);
	System.out.println("ram:"+ram);
	System.out.println("type:"+type);
	System.out.println("hard:"+hard);
	System.out.println("motherboard:"+motherboard);
	System.out.println("cache: "+cache);
	System.out.println("cost: "+cost);
	System.out.println("quantity:"+quantity);
	
	//wrapper classes and type conversion
	//Integer lg=Integer.valueOf(cost);//non-primitive to non-primitive number
	int intCost =Integer.parseInt(cost);  //non-primitive to primitive number called Auto Un-boxing
	int intQuantity=Integer.parseInt(quantity);
	
	int total=intCost*intQuantity;
	
	System.out.println("cost is: "+total);//console
	
	
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
			+ "<a class=\" btn btn-primary navbar-brand\" href=\"design.html\">Form</a>");

	write1.write("</div>");
	write1.write("</div>");
	write1.write("</nav>");
	write1.write("</div>");
	write1.write("<b>computer parts under processing...</b>");
	write1.write("<br><b> Total cost is:</b> "+total);
	
	write1.write("</div>");
	write1.write("</body>");
	write1.write("</html>");
	
	
	

			
				
	}
	
}

