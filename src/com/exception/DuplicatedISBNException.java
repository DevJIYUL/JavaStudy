package com.exception;

public class DuplicatedISBNException extends Exception {
	String message;

	public DuplicatedISBNException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "DuplicatedISBNException [message=" + message + "]";
	}
}
