package com.example.angularWithSpringBootRest.helloworld.bean;


public class HelloWorldBean {

	private String msg;

	
	public HelloWorldBean() {}

	public HelloWorldBean(String msg) {
		this.msg = msg;
		}
	
	public String getMsg() {return msg;}
	public void setMsg(String msg) {this.msg = msg;}

	@Override
	public String toString() {
		return String.format("HelloWorldBean [msg=%s]", msg);
	}
	
}
