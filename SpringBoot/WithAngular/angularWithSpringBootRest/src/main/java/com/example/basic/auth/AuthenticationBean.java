package com.example.basic.auth;


public class AuthenticationBean {

	private String msg;

	
	public AuthenticationBean() {}

	public AuthenticationBean(String msg) {
		this.msg = msg;
		}
	
	public String getMsg() {return msg;}
	public void setMsg(String msg) {this.msg = msg;}

	@Override
	public String toString() {
		return String.format("HelloWorldBean [msg=%s]", msg);
	}
	
}
