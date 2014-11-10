package com.kushal.springframework.web.controllers;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
//this controllerAdvice is from the aspect oriented programming, a method that runs due to other method running.
public class DatabaseErrorHandler {
	// DataAccessException will be thrown for any runtime exception
	@ExceptionHandler(DataAccessException.class)
	public String handleDBException(DataAccessException ex) {
		return "error";
	}
}
