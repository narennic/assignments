package com.virtusa.convert;

import org.junit.Test;

import com.virtusa.convert.App;
import com.virtusa.convert.exceptions.InvalidInputException;
import com.virtusa.convert.exceptions.ValidationException;

import junit.framework.TestCase;

public class AppTest extends TestCase{

	
	@Test(expected = NumberFormatException.class)
	public void test1() {
		try {
			App.process("86rt97");
		} catch (Exception e) {
		}
	}		
	
	@Test(expected = NumberFormatException.class)
	public void testNullInput() {
		try {
			App.process(null);
		} catch (Exception e) {
		}
	}
	
	@Test(expected = NumberFormatException.class)
	public void test16765544981() {
		try {
			App.process("16765544981");
		} catch (Exception e) {
		}
	}
	
	@Test(expected = InvalidInputException.class)
	public void testSignedNumber() throws ValidationException {
		App.process("-788");
	}	
	
}
