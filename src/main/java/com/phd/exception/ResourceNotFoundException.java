package com.phd.exception;


public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -3799497177246615357L;

	public ResourceNotFoundException() {
		super();
	}
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}

	public ResourceNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ResourceNotFoundException(Throwable cause) {
		super(cause);
	}

}
