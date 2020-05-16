package com.in28minutes.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28minutes.todo.TodoService;

@WebServlet("/todo.do")
public class TodoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private TodoService todoService = new TodoService();
	
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("todos", todoService.RetrieveTodos());
		request.getRequestDispatcher("/views/todo.jsp").forward(request, response);
		
	}


}
