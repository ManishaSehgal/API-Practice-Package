package org.testing.Utilities;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomString_Generation {
	
	public static String random_String(int count ) {
		boolean letters = true;
		boolean numbers = false;	
		String s = RandomStringUtils.random(count, letters, numbers);
		
		return s;
	}

}
