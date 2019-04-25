package com.bean;

public class LifeCycle {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("Bean Initialization...");
	}
	
	public void destroy() {
		System.out.println("Bean Destroyed...");
	}

}
