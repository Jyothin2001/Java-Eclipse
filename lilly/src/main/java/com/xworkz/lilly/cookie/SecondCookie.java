package com.xworkz.lilly.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns = "/cookie", loadOnStartup = 1)
public class SecondCookie extends HttpServlet
{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		import javax.servlet.ServletException;
		import javax.servlet.annotation.WebServlet;
		import javax.servlet.http.Cookie;
		import javax.servlet.http.HttpServlet;
		import javax.servlet.http.HttpServletRequest;
		import javax.servlet.http.HttpServletResponse;
		import java.io.IOException;
		import java.util.UUID;

		@WebServlet(name = "cookieServlet", urlPatterns = "/cook", loadOnStartup = 1)
		public class CookieServlet extends HttpServlet {
		    public CookieServlet() {
		        System.out.println("Running Cookie in Servlet");
		    }

		    @Override
		    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		        String randomValue = getCookieValue(req, "myCookie");


		        if (randomValue == null) {
		            randomValue = generateRandomValue();


		            Cookie cookie = new Cookie("myCookie", randomValue);
		            cookie.setMaxAge(60 * 60);
		            resp.addCookie(cookie);
		        }

		        Cookie[] cookies = req.getCookies();
		        if (cookies != null && cookies.length > 0) {
		            for (Cookie receivedCookie : cookies) {
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

		    private String getCookieValue(HttpServletRequest request, String cookieName) {
		        Cookie[] cookies = request.getCookies();
		        if (cookies != null) {
		            for (Cookie cookie : cookies) {
		                if (cookie.getName().equals(cookieName)) {
		                    return cookie.getValue();
		                }
		            }
		        }
		        return null;
		    }
		}

		
		Cookie cookies[]=req.getCookies();
		
		String str=null;
		
		for(Cookie c:cookies)
		{
			if(c.getName().equals("cookies"));
			{
			str=c.getValue();	
			}
		
		}
		PrintWriter write=res.getWriter();
		write.print("welcome" +str);
	}

}


package college_jsp;
import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/SetCookieServlet", loadOnStartup = 1)
public class SetCookieServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Create a cookie
    	Random random=new Random();
    	
        Cookie cookie = new Cookie("my_cookie",String.valueOf(random.nextLong() ));

        // Set the cookie's expiration time (optional)
        cookie.setMaxAge(24 * 60 * 60); // Cookie will expire in 1 day (24 hours * 60 minutes * 60 seconds)

        // Add the cookie to the response
        response.addCookie(cookie);

        // Send a response
        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Cookie Set!</h1>");
        response.getWriter().println("</body></html>");
    }
}

