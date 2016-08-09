package com.epam.bence_szabo.oop;

public class FlightTicket {
	private final double price;
	private double discount;
	private Flight flight;
	
	public FlightTicket(double discount, Flight flight){
		this.discount = discount;
		this.flight = flight;
		
		this.price = flight.getPrice();
	}

	public double getDiscountedPrice() {
		return price * (1.0 - discount);
	}

}
