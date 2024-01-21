package com.sagar.rest.webservices.restfulwebservices.JPA;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagar.rest.webservices.restfulwebservices.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
