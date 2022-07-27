package com.exception;

public class NoResultException extends Exception {
	String message;

	public NoResultException(String message) {
		super();
		this.message = message;
	}

	public NoResultException() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NoResultException [message=" + message + "]";
	}
}
