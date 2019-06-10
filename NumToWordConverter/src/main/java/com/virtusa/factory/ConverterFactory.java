package com.virtusa.factory;

import com.virtusa.convert.api.Converter;
import com.virtusa.converters.NumToWordConverter;

public class ConverterFactory {

	public static Converter createNumberToWordConverter() {
		return new NumToWordConverter();
	}

}
