package com.virtusa.convert.exceptions;

/**
 * Common Input Validations
 * 
 * @author Narenderr
 *
 */
public class InvalidInputException extends ValidationException {

	private static final long serialVersionUID = -1864072323085226913L;

	public InvalidInputException(String msg) {
		super(msg);
	}

	public InvalidInputException(String msg, Throwable exc) {
		super(msg, exc);
	}

	public InvalidInputException(Throwable exc) {
		super(exc);
	}
}
