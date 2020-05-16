package com.in28minutes.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Browser sends Http Request to Web Server
 * 
 * Code in Web Server => Input:HttpRequest, Output: HttpResponse
 * JEE with Servlets
 * 
 * Web Server responds with Http Response
 */

//Java Platform, Enterprise Edition (Java EE) JEE6

//Servlet is a Java programming language class 
//used to extend the capabilities of servers 
//that host applications accessed by means of 
//a request-response programming model.

//1. extends javax.servlet.http.HttpServlet
//2. @WebServlet(urlPatterns = "/login.do")
//3. doGet(HttpServletRequest request, HttpServletResponse response)
//4. How is the response created?

@WebServlet(name="login", urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	
	private LoginService userValidatiobService = new LoginService();
	
	private static final long serialVersionUID = 1L;
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{

		boolean isUserValid = userValidatiobService.isUserValid(req.getParameter("a"), req.getParameter("b"));
		
		if(isUserValid){
			res.sendRedirect("todo.do");
		}else{
			req.setAttribute("errorMensage", "User Invalid");
			req.getRequestDispatcher("/views/Form.jsp").forward(req, res);
		}
	}

}