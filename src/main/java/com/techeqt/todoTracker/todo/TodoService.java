package com.techeqt.todoTracker.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();
	static {
		todos.add(new Todo(1, "jk", "practice singing", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(2, "jk", "practice english", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(3, "jk", "practice dancing", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(4, "jk", "practice guitar", LocalDate.now().plusYears(2), false));
	}

	public List<Todo> findByUsername(String username) {
		return todos;
	}

}
