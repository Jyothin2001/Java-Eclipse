package com.xworkz.things;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="hi",urlPatterns="/frame",loadOnStartup=1)
public class FrameServlet extends HttpServlet
{
		private static final long serialVersionUID = 1L;
		
	public FrameServlet()
	{
		System.out.println("no -args const ");
	}
	@Override
        protected void service(HttpServletRequest request, HttpServletResponse respond) throws ServletException, IOException 
	{
        
        System.out.println("running in frame");
        System.out.println("server request ip addresses"  + request.getRemoteAddr());
        }	
	}


