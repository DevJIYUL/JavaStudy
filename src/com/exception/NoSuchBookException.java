package com.exception;

public class NoSuchBookException extends Exception {
	String message;

	public NoSuchBookException(String message) {
		super();
		this.message = message;
	}
	@Override
	public String toString() {
		return "NoSuchBookException [message=" + message + "]";
	}

	
}
