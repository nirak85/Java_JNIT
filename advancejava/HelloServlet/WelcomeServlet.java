package com.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */

public class WelcomeServlet extends HttpServlet {
	
	public static final String SERVLET ="welcome";
	public static final String SERVLETT ="byebye";

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	private static void process(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
			String username=request.getParameter("user");
			String password=request.getParameter("pass");
			String email=request.getParameter("email");
			String phone=request.getParameter("phone");
			
				PrintWriter pw= response.getWriter();
						pw.println("<html><body bgcolor='#ffbf80'>");
						pw.println("<center><h2>Welcome to JNIT</h2></center>");
						pw.println("<h1> "+username+"</h1>");
						pw.println("Email: "+email+"");
						pw.println("</br>Phone NO: "+phone+"");
						pw.println("</body> </html>");
		
		}
	}
 	

