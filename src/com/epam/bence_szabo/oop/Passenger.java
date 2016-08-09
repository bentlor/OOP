package com.epam.bence_szabo.oop;

public class Passenger {

	private FrequentFlyer ffProgram = FrequentFlyer.OCCASIONAL;
	private int miles;
	

	public FrequentFlyerProgram getFrequentFlyerProgram() {
		return ffProgram;
	}

	public double getDiscount() {
		return ffProgram.getDiscount();
	}
	
	public void addMiles(int miles) {
		this.miles += miles;
		promotePassenger();
	}
	
	private void promotePassenger() {
		while(ffProgram.hasNext() && ffProgram.next().eligible(miles)) {
			ffProgram = ffProgram.next();
		}
	}
	
}