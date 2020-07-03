package com.udemy.in28minutes.rest.webservices.restfulwebservices.user.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.in28minutes.rest.webservices.restfulwebservices.user.bean.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
	
	
}
