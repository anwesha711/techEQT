package com.techeqt.todoTracker.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private static int todosCount=0;

	private static List<Todo> todos = new ArrayList<>();
	static {
		todos.add(new Todo(++todosCount, "jk", "practice singing", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount, "jk", "practice english", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todosCount, "jk", "practice dancing", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount, "jk", "practice guitar", LocalDate.now().plusYears(2), false));
	}

	public List<Todo> findByUsername(String username) {
		return todos;
	}

	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todosCount, username, description, targetDate, done);
		todos.add(todo);
	}
}
