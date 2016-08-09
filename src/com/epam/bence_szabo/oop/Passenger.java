package com.epam.bence_szabo.oop;

public class Passenger {

	private FrequentFlyerProgram ffProgram = new OccasionalFlyer();
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
		if (GoldFrequentFlyer.eligible(miles) && !(ffProgram instanceof GoldFrequentFlyer)) {
			ffProgram = new GoldFrequentFlyer();
		} else if (miles > 20000 && !(ffProgram instanceof SilverFrequentFlyer)) {
			ffProgram = new SilverFrequentFlyer();
		}
	}
	
}
