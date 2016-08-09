package com.epam.bence_szabo.oop;

public class SilverFrequentFlyer extends FrequentFlyer {

	private static final int MIN_MILES = 20000;
	
	@Override
	public double getDiscount() {
		return 0.02;
	}

	public static boolean eligible(int miles) {
		return miles > MIN_MILES;
	}
}
