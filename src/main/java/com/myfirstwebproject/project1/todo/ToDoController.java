package com.myfirstwebproject.project1.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

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
		String userName = (String)map.get("name");
		List<Todo> todos = todoService.findByUsername(userName);
		map.addAttribute("todos",todos);
		return "listTodos.jsp";
	}
	
	// list-todos
		@RequestMapping	(value="add-todo",method=RequestMethod.GET)
		public String showNewTodoPage(ModelMap model) {
			//the following object will show the default value
			Todo todo = new Todo(0,(String)model.get("name"),"",LocalDate.now().plusYears(1),false);
			model.put("todo", todo);
			return "todo.jsp";
		}
	
		@RequestMapping	(value="add-todo",method=RequestMethod.POST)
		public String addTodoPage(ModelMap model, @Valid Todo todo, BindingResult result) {
			
			if(result.hasErrors()) {
				return "todo.jsp";
			}
			
			todoService.addTodo((String)model.get("name"), todo.getDescription(), todo.getTargetDate(), false);
			return "redirect:list-todos";
		}
		
		// list-todos
		@RequestMapping	("delete-todo")
		public String deleteTodo(@RequestParam int id) {
			//Delete Todo
			todoService.deleteById(id);
			return "redirect:list-todos";
		}
	
		@RequestMapping	(value="update-todo", method=RequestMethod.GET)
		public String showUpdateTodoPage(@RequestParam int id,ModelMap map) {
			//Update Todo
			Todo todo = todoService.findById(id);
			map.addAttribute("todo", todo);
			return "todo.jsp";
		}
		
		@RequestMapping	(value="update-todo",method=RequestMethod.POST)
		public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
			
			if(result.hasErrors()) {
				return "todo.jsp";
			}
			todo.setUsername((String)model.get("name"));
			todoService.updateById(todo);
			return "redirect:list-todos";
		}
}
