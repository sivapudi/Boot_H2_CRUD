package com.phd.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ErrorMessage resourceNotFoundException(ResourceNotFoundException rnfe, WebRequest request) {

		return new ErrorMessage(HttpStatus.NOT_FOUND.value(), new Date(), rnfe.getMessage(),
				request.getDescription(false));

	}

}
