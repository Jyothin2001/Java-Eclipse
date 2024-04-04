package com.xworkz.cookie.things;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="cookieServlet", urlPatterns = "/cook",loadOnStartup = 1)
public class CookieServlet extends HttpServlet {
	
	public CookieServlet() {
		System.out.println("Running no param const of CookieServlet");
		
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String randomValue = getCookieValue(req,"myCookie");
		
		if(randomValue==null)
		{
			randomValue=generateRandomValue();
			
			Cookie cookie = new Cookie("myCookie",randomValue);
			cookie.setMaxAge(60*60);
			resp.addCookie(cookie);
			
			
		}
		
		Cookie[] cookie1=req.getCookies();
		 if (cookie1 != null && cookie1.length > 0) {
	            for (Cookie receivedCookie : cookie1) {
	                System.out.println("Received Cookie Name: " + receivedCookie.getName());
	                System.out.println("Received Cookie Value: " + receivedCookie.getValue());
	            }
	        } else {
	            System.out.println("No cookies found in the request.");
	        }
	    }

	    private String generateRandomValue() {
	        return UUID.randomUUID().toString();
	    }


	   
	private String getCookieValue(HttpServletRequest req, String string) {
		    Cookie[] cookies = req.getCookies();
	        if (cookies != null) 
	        {
	            for (Cookie cookie : cookies) 
	            {
	                if (cookie.getName().equals(cookie))
	                {
	                    return cookie.getValue();
	                }
	            }
	        }
	     return null;  
}
}