package com.app;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description="Simple servlet program",urlPatterns="/SimpleServlet")
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("First servlet program");
	
		String name= request.getParameter("name");
		response.getWriter().println("Welcome to simple servlet progrma  "+name);
		HttpSession session = request.getSession();
		ServletContext context  = request.getServletContext();
		
		if(name !=null && name!=""){
			session.setAttribute("name", name);
			context.setAttribute("name", name);
		}
	
		response.getWriter().println("Session name  "+session.getAttribute("name"));
		response.getWriter().println("Context name  "+context.getAttribute("name"));
		
		
		
	}

}
