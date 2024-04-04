package com.xworkz.things;

import java.io.IOException;

import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/first",loadOnStartup = 1)
public class cookie extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	public cookie() 
	{
		System.out.println("Running no param const of CookieServlet");
		
	}
	
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    
    {
    	
    	
    	String firstname=request.getParameter("name");
    	String lastname=request.getParameter("last");
    	
    	
    	String randomValue = getCookieValue(request, "Xworkz");

    	if (randomValue == null) 
    	{

    	randomValue = generateRandomValue();

    	Cookie cookie = new Cookie("Xworkz", randomValue);

    	cookie.setMaxAge(60 * 60);

    	response.addCookie(cookie);

    	}

    	request.setAttribute("randomValue", randomValue);
    	

    	RequestDispatcher dispatcher = request.getRequestDispatcher("ContactDetails.jsp");
    	
    	HttpSession sess=request.getSession();
    	
    	sess.setAttribute("firstname", firstname);

    	sess.setAttribute("lastname", lastname);

    	dispatcher.forward(request, response);

    	}

    	private String generateRandomValue() 
    	{

    	String uuid = UUID.randomUUID().toString();

    	return uuid.substring(0, 20);

    	}

    	private String getCookieValue(HttpServletRequest request, String cookieName)
    	{

    	Cookie[] cookies = request.getCookies();

    	if (cookies != null) 
    	{

    	for (Cookie cookie : cookies) 
    	{

    	if (cookie.getName().equals(cookieName)) 
    	{

    	return cookie.getValue();

    	}

    	}

    	}

    	return null;

    	}
    	

    	}

      