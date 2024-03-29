package com.rest.boot.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends Exception {

	private static final long serialVersionUID = -7652891603649864730L;
	
	public UserNotFoundException(String message) {
		super(message);
	}
	
}
