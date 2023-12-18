package com.myfirstwebproject.project1.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class ToDoController {
	
	private ToDoService todoService;
 
	
	
	public ToDoController(ToDoService todoService) {
		super();
		this.todoService = todoService;
	}



	// list-todos
	@RequestMapping	("list-todos")
	public String listAllTodos(ModelMap map) {
		List<Todo> todos = todoService.findByUsername("inSagar");
		map.addAttribute("todos",todos);
		return "listTodos.jsp";
	}
	
}
