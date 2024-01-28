package com.myfirstwebproject.project1.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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
public class ToDoControllerJpa {
	
 
	private TodoRepository todoRepository;
	
	
	public ToDoControllerJpa( TodoRepository todoRepository) {
		super();
		this.todoRepository = todoRepository;
	}



	// list-todos
	@RequestMapping	("list-todos")
	public String listAllTodos(ModelMap map) {
		
		String userName = getName(map);
		List<Todo> todos = todoRepository.findByUsername(userName);
		map.addAttribute("todo",todos);
		return "listTodos.jsp";
	}

	// list-todos
		@RequestMapping	(value="add-todo",method=RequestMethod.GET)
		public String showNewTodoPage(ModelMap model) {
			//the following object will show the default value
			Todo todo = new Todo(0,getName(model),"",LocalDate.now().plusYears(1),false);
			model.put("todo", todo);
			return "todo.jsp";
		}
	
		@RequestMapping	(value="add-todo",method=RequestMethod.POST)
		public String addTodoPage(ModelMap model, @Valid Todo todo, BindingResult result) {
			
			if(result.hasErrors()) {
				return "todo.jsp";
			}
			todo.setUsername(getName(model));
			todoRepository.save(todo);
			
			//todoService.addTodo(todo.getUsername(), todo.getDescription(), todo.getTargetDate(), todo.isDone());
			return "redirect:list-todos";
		}
		
		// list-todos
		@RequestMapping	("delete-todo")
		public String deleteTodo(@RequestParam int id) {
			//Delete Todo
			todoRepository.deleteById(id);
			//todoService.deleteById(id);
			return "redirect:list-todos";
		}
	
		@RequestMapping	(value="update-todo", method=RequestMethod.GET)
		public String showUpdateTodoPage(@RequestParam int id,ModelMap map) {
			//Update Todo
			Todo todo = todoRepository.findById(id).get();
			map.addAttribute("todo", todo);
			return "todo.jsp";
		}
		
		@RequestMapping	(value="update-todo",method=RequestMethod.POST)
		public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
			
			if(result.hasErrors()) {
				return "todo.jsp";
			}
			todo.setUsername(getName(model));
			todoRepository.save(todo);
		//	todoService.updateById(todo);
			return "redirect:list-todos";
		}
		
		private String getName(ModelMap map) {
			Authentication authentication =
					SecurityContextHolder.getContext().getAuthentication();
			
			return authentication.getName();
		}
}
