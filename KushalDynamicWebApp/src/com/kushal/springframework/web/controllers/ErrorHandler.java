package com.kushal.springframework.web.controllers;

import org.springframework.dao.DataAccessException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
//this controllerAdvice is from the aspect oriented programming, a method that runs due to other method running.
public class ErrorHandler {
	// DataAccessException will be thrown for any runtime exception
	@ExceptionHandler(DataAccessException.class)
	public String handleDBException(DataAccessException ex) {
		ex.printStackTrace();
		return "error";
	}
	@ExceptionHandler(AccessDeniedException.class)
	public String handleAccessException(AccessDeniedException ex) {
		return "denied";
	}
}
