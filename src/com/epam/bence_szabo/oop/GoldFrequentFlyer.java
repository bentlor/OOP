package com.epam.bence_szabo.oop;

public class GoldFrequentFlyer extends FrequentFlyer {

	private static final int MIN_MILES = 50000;
	
	@Override
	public double getDiscount() {
		return 0.03;
	}

	public static boolean eligible(int miles) {
		return miles > MIN_MILES;
	}

}
