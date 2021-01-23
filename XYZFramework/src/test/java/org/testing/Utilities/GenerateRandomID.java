package org.testing.Utilities;

import java.util.Random;

public class GenerateRandomID {
	
	public static String randomIdGeneration() {
		Random randomObj = new Random();
		int i = randomObj.nextInt(9000000)+100000;
		String s = String.valueOf(i);	
		return s;
	}


}
