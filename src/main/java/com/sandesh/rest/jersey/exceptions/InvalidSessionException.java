package com.sandesh.rest.jersey.exceptions;

public class InvalidSessionException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public InvalidSessionException(String message) {
		super(message);
	}
}
