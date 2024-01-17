package com.sagar.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	// JPA //Hibernate > Database
	
	//UserDaoService > Static List
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1,"Adam",LocalDate.now().minusYears(30)));
		users.add(new User(2,"Eve",LocalDate.now().minusYears(25)));
		users.add(new User(3,"Kim",LocalDate.now().minusYears(20)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
}
