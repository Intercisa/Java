package com.example.springboot.jpa.easyjpaexample.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.jpa.easyjpaexample.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
