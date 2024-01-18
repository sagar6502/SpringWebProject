package com.sagar.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	// JPA //Hibernate > Database
	
	//UserDaoService > Static List
	
	private static List<User> users = new ArrayList<>();
	
	private static Integer usersCount = 100;
	
	static {
		users.add(new User(++usersCount,"Adam",LocalDate.now().minusYears(30)));
		users.add(new User(++usersCount,"Eve",LocalDate.now().minusYears(25)));
		users.add(new User(++usersCount,"Kim",LocalDate.now().minusYears(20)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User findOne(int id){
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}

	public User createNewUser(User user) {
		// TODO Auto-generated method stub
		user.setId(++usersCount);
		users.add(user);
		return user;
	}

	public void deleteOne(int id) {
		// TODO Auto-generated method stub
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		users.removeIf(predicate);
	}
	
}
