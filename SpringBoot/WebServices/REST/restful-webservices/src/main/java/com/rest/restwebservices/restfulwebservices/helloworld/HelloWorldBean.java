package com.rest.restwebservices.restfulwebservices.helloworld;

public class HelloWorldBean {
	private String msg;
	
	
	protected HelloWorldBean() {}
	protected HelloWorldBean(String msg) {this.msg = msg;}

	public String getMsg() {return msg;}
	public void setMsg(String msg) {this.msg = msg;}
	
	@Override
	public String toString() {
		return String.format("HelloWorldBean [msg=%s]", msg);
	}	
	
	
}
