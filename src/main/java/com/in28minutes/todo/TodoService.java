package com.in28minutes.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	static {
		todos.add(new Todo("Learn WEB Aplication Development"));
		todos.add(new Todo("Learn Spring MVC"));
		todos.add(new Todo("Learn Rest Services"));
	}
	
	public List<Todo> RetrieveTodos() {
		return todos;
	}
	
	public void addTodo(String todo){
		todos.add(new Todo(todo));
	}
	
	public void removeTodo(String todo){
		todos.remove(new Todo(todo));
	}
}
