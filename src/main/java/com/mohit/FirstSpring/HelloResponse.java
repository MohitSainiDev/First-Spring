package com.mohit.FirstSpring;

public class HelloResponse {

	private String message;

	public HelloResponse(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}