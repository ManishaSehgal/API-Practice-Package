package org.testing.Utilities;

import java.util.Random;

public class RandomInt_Generation {
	
	public static String random_Id() {
		Random r = new Random();
		Integer i = r.nextInt();
		return i.toString();
	}

}
