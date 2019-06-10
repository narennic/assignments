package com.virtusa.convert;

import org.junit.Test;

import com.virtusa.convert.exceptions.ValidationException;
import com.virtusa.factory.ConverterFactory;

import junit.framework.TestCase;

public class NumToWordConverterTest extends TestCase {

	@Test
	public void test0()  {
		assertEquals("zero", ConverterFactory.createNumberToWordConverter().convert(0));
	}
	
	@Test
	public void test6() {
		assertEquals(" six", ConverterFactory.createNumberToWordConverter().convert(6));
	}
	
	@Test
	public void test11() throws ValidationException {
		assertEquals(" eleven", ConverterFactory.createNumberToWordConverter().convert(11));
	}	

	@Test
	public void test100() throws ValidationException {
		assertEquals(" one hundred", ConverterFactory.createNumberToWordConverter().convert(100));
	}
	
	@Test
	public void test2311() throws ValidationException {
		assertEquals(" one thousand seven hundred and fifty five", ConverterFactory.createNumberToWordConverter().convert(1755));
	}	
	
	@Test
	public void test6534128() throws ValidationException {
		assertEquals(" six million five hundred and thirty four thousand one hundred and twenty eight", ConverterFactory.createNumberToWordConverter().convert(6534128));
	}	
}
