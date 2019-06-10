package com.virtusa.convert;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.virtusa.convert.api.Converter;
import com.virtusa.convert.exceptions.InvalidInputException;
import com.virtusa.convert.exceptions.ValidationException;
import com.virtusa.factory.ConverterFactory;

/**
 * Number To Word Format Converter
 *
 */
public class App {
	public static void main(String[] args)  {
		
		String val = null;
		try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("Enter Positive Number");
			val = in.readLine();
			process(val);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void process(String value) {
		int num = 0;
		try {
			num = Integer.parseInt(value);		
			if(num<0) {
				throw new InvalidInputException("Please provide only positive integer");
			}
			if(num>999999999) {
				throw new InvalidInputException("Please provide integer below 999999999");
			}
			Converter converter = ConverterFactory.createNumberToWordConverter();
			System.out.println(converter.convert(num));
		}catch(NumberFormatException nfe) {
			System.out.println("Please provide a valid integer > 0 and < 999999999");
		}catch (ValidationException e) {
			System.out.println(e);
		}
	}
}
