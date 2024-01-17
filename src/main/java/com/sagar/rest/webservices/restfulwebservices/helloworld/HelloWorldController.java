package com.sagar.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//REST_API

@RestController
public class HelloWorldController {

	// /hello-world
	@GetMapping(path ="/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path ="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
}
