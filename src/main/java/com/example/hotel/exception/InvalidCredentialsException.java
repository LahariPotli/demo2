package com.example.hotel.exception;

public class InvalidCredentialsException extends Exception {

	private static final long serialVersionUID = 1L;

	String message;

	public InvalidCredentialsException(String message) {
		super(message);
		this.message = message;
	}

	public InvalidCredentialsException() {
		super();
	}

}
