package com.sagar.rest.webservices.restfulwebservices.JPA;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagar.rest.webservices.restfulwebservices.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
