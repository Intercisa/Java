package com.example.angularWithSpringBootRest.jwt;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtInMemoryUserDetailsService implements UserDetailsService {

  static List<JwtUserDetails> inMemoryUserList = new ArrayList<>();

  static {
    inMemoryUserList.add(new JwtUserDetails(1L, "in28minutes",
        "$2a$10$3zHzb.Npv1hfZbLEU5qsdOju/tk2je6W6PnNnY.c1ujWPcZh4PL6e", "ROLE_USER_2"));
    
    inMemoryUserList.add(new JwtUserDetails(1L, "sipi",
    		"$2a$10$jQ.2BdpTIip57HBVaB.YpOCgjIlCO4FeBN.syyMkhNhkSbS4CMWu6", "ROLE_USER_2"));
  }
  
  //$2a$10$jQ.2BdpTIip57HBVaB.YpOCgjIlCO4FeBN.syyMkhNhkSbS4CMWu6
  //http://localhost:8080/authenticate
  /*
   * {
   * "username": "sipi",
   * "password": "password"
   * }
   */
  //"token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJzaXBpIiwiZXhwIjoxNTg5ODkzMzU4LCJpYXQiOjE1ODkyODg1NTh9.o0XalSE1f5xUHCrkk4W9N0L8Pq1hTHeBxpuUVqnyrKvOz8FLbNQ3dHdjyMTRNrEAPtdbBnlm6PvOp4tbcYjRBQ"
 
  /*
   * Authorization Bearer + token >> Bearer eyJhbGciOiJIUz...
   * 
   * 
   */
  
  
  
  
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Optional<JwtUserDetails> findFirst = inMemoryUserList.stream()
        .filter(user -> user.getUsername().equals(username)).findFirst();

    if (!findFirst.isPresent()) {
      throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
    }

    return findFirst.get();
  }

}


