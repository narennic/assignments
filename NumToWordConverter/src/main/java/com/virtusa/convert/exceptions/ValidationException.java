package com.virtusa.convert.exceptions;

/**
 * Any specific validations rules and common validations
 * 
 * @author Narenderr
 *
 */
public class ValidationException extends Exception {

	private static final long serialVersionUID = -1864072323085226913L;
	
	public ValidationException(String msg) {
		super(msg);
	}
	
	public ValidationException(String msg, Throwable exc) {
		super(msg, exc);
	}
	
	public ValidationException(Throwable exc) {
		super(exc);
	}

}
