package org.kitcheck.standalone;

import org.kitcheck.standalone.service.DictionaryLookup;

public class VanityPhoneNumber {

	public static void main(String[] args) {

		if (args.length < 2 ) {
			throw new IllegalArgumentException("Please enter dictioanry file name and phone number as arguments");
			
		}
		String file = args[0];
		String number = args[1];
		
		DictionaryLookup lookup = new DictionaryLookup();
		lookup.createDictionaryAndFindMatchingEntries(file, number);
	}

}
