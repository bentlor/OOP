package com.epam.bence_szabo.oop;

import java.util.ArrayList;
import java.util.List;

public class PassengerGroup {
	
	private List<Passenger> passengers;
	
	public PassengerGroup (Passenger... passengers) {
		this.passengers = new ArrayList<>();
		for (Passenger p : passengers) {
			this.passengers.add(p);
		}
	}

	public double getDiscount() {
		double discountSum = 0;
		for (Passenger p : passengers) {
			discountSum += p.getDiscount();
		}
		return discountSum/passengers.size();
	}

	public int getPassengerCount() {
		return passengers.size();
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}
	
	

}
