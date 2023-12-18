package com.myfirstwebproject.project1.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {
	
	private static List<Todo> todos = new ArrayList<>();
	
	static {
		todos.add(new Todo(1,"inSagar","Learn AWS",LocalDate.now().plusYears(1), false));
		todos.add(new Todo(2,"inSagar","Learn DevOps",LocalDate.now().plusYears(2), false));
		todos.add(new Todo(3,"inSagar","Learn Git",LocalDate.now().plusYears(3), false));
		todos.add(new Todo(4,"inSagar","Learn CI",LocalDate.now().plusYears(4), false));
	}

	public List<Todo> findByUsername(String username){
		return todos;
	}
}
