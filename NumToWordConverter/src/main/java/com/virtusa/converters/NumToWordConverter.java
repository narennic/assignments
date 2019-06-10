package com.virtusa.converters;

import com.virtusa.convert.api.Converter;

/**
 * Validates input number and converts to word format of the number if the input
 * is valid
 * 
 * @author Narenderr
 *
 */
public class NumToWordConverter implements Converter {

	private final String[] onesAndTeens = { "", " one", " two", " three", " four", " five", " six", " seven", " eight",
			" nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen",
			" eighteen", " nineteen" };
	private final String[] tens = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty", " seventy",
			" eighty", " ninety" };

	

	/**
	 * Actual conversion from number to word format
	 * 
	 * @param i
	 * @return
	 */
	public String convert(int i) {
		String[] places = { "", " thousand", " million" };
		String word = "";
		if (i == 0) {
			return "zero";
		}

		int place = 0;
		do {
			int num = i % 1000;
			if (num != 0) {
				String converted = convertLessThanThousand(num);
				word = converted + places[place] + word;
			}
			place++;
			i /= 1000;
		} while (i > 0);

		return word;
	}

	/**
	 * Converts less 1 - 999 number to word format
	 * 
	 * @param i
	 * @return
	 */
	private String convertLessThanThousand(int i) {
		String word = "";
		if (i % 100 < 20) {
			// ones place and tens place till 19 (1-19)
			word = onesAndTeens[i % 100];
			i /= 100;
		} else {
			// ones place (20-99)
			word = onesAndTeens[i % 10];
			i /= 10;

			// tens place (20-99)
			word = tens[i % 10] + word;
			i /= 10;
		}

		if (i == 0)
			return word;

		if("".equals(word)) {
			return onesAndTeens[i] + " hundred";
		}else {			
			return onesAndTeens[i] + " hundred and" + word;
		}
	}

}
