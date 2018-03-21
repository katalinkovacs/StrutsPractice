package com.kati.helloworld.model;


public class MessageStore {
	
	private String message;
	
	public MessageStore() {
		
		setMessage("Hello Struts Cutomer");
	}

	public String getMessage() {

		return message;
	}

	public void setMessage(String message) {

		this.message = message;
	}
	
	public String toString() {
		
		return message + " (from toString)";
		
	}

}
