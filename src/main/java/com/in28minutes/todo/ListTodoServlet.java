package com.in28minutes.todo;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28minutes.todo.Todo;
import com.in28minutes.todo.TodoService;

@WebServlet("/list-todo.do")
public class ListTodoServlet extends HttpServlet {
	
	private TodoService todoService = new TodoService();
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("todos", todoService.RetrieveTodos());
		request.getRequestDispatcher("/views/todo.jsp").forward(request, response);
		
	}



}
