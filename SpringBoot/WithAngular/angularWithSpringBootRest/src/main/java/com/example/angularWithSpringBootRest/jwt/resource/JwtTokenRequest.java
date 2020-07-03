package com.example.angularWithSpringBootRest.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;
    
    
    //{
	//"token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJzaXBpIiwiZXhwIjoxNTg5ODkxNzk4LCJpYXQiOjE1ODkyODY5OTh9.v9G4FTkh6UVwgGgeC566X1KSFxfpWvy2Lca_PIZNliRGRA_w2eMiOBgw9m_MitOJRjjaUB3Q2qG48_qyIhYGqw"
    //}

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

