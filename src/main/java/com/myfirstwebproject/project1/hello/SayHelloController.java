package com.myfirstwebproject.project1.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

		//"say-hello" => "Hello! What are you learning today?"
	//Spring MVC does not has its own view
	
	@RequestMapping("say-hello")
	@ResponseBody 
	public String sayHello() {
		System.out.println();
		return "Hello! What are you learning today?";
		
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody 
	public String sayHelloHTML() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My first HTML page - Changed </title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first HTML page with Body. -  Changed");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
		
	}
	
	
	//JSP - Java Servlet Page
	//say-hello-jsp
	//src\main\resources\META-INF\resources\WEB-INF\jsp\sayHello.jsp
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello.jsp";
		
	}
	
}
