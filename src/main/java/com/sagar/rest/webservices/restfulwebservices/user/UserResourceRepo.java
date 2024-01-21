package com.sagar.rest.webservices.restfulwebservices.user;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.sagar.rest.webservices.restfulwebservices.JPA.UserRepository;

@RestController
public class UserResourceRepo {

	
	@Autowired
	UserRepository userRepository;

	// GET /users
	@GetMapping("/jpa/users")
	public List<User> retrieveAllUser() {
		return userRepository.findAll();
	}

	//http://localhost:8080/users
	//EntityModel
	//WebMvcLinkBuilder
	
	@GetMapping("/jpa/users/{id}")
	public EntityModel<User> retrieveUser(@PathVariable int id) {
		User user = userRepository.findById(id).get();
		
		if(user == null) {
			throw new UserNotFoundException("id: "+id);
		}
		EntityModel<User> entityModel = EntityModel.of(user);
		WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retrieveAllUser());
		entityModel.add(link.withRel("all-users"));
		return entityModel;
	}


	@PostMapping("/jpa/users")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User newUser = userRepository.save(user);
		URI location = ServletUriComponentsBuilder
						.fromCurrentRequest().
						path("/{id}").
						buildAndExpand(newUser.getId())
						.toUri();
		// location - /users/4
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/jpa/users/{id}")
	public void deleteUser(@PathVariable int id) {
		userRepository.deleteById(id);
	}
}
