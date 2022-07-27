package com.exception;

public class YourException  extends Exception{
	String message;
	public YourException(String message) {
		super();
		this.message = message;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public String toString() {
		return "YourException [ shit message=" + message + "] hi";
	}

}
