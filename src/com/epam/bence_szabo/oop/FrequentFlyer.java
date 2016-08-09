package com.epam.bence_szabo.oop;

public abstract class FrequentFlyer implements FrequentFlyerProgram {

	@Override
	public abstract double getDiscount();

	public static boolean eligible(int miles) {
		return false;
	}

}
