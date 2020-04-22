package com.udemy.in28minutes.rest.webservices.restfulwebservices.user.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.in28minutes.rest.webservices.restfulwebservices.user.bean.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	
}
