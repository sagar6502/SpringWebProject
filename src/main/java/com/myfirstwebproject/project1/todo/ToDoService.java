	package com.myfirstwebproject.project1.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {
	
	private static List<Todo> todos = new ArrayList<>();
	
	private static int todosCount = 0;
	
	static {
		todos.add(new Todo(++todosCount,"inSagar","Learn AWS",LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount,"inSagar","Learn DevOps",LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todosCount,"inSagar","Learn Git",LocalDate.now().plusYears(3), false));
		todos.add(new Todo(++todosCount,"inSagar","Learn CI",LocalDate.now().plusYears(4), false));
	}

	public List<Todo> findByUsername(String username){
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean isItDone){
		Todo todo = new Todo(++todosCount, username, description, targetDate, isItDone);
		todos.add(todo);
	}
	
	public void deleteById(int id){
		//todo -> todo.getId() == id
		Predicate<? super Todo> predicate 
		= todo -> todo.getId() == id;
		
		todos.removeIf(predicate);
	}
}
