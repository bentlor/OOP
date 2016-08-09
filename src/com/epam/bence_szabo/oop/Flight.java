package com.epam.bence_szabo.oop;

public class Flight {

	private double price;
	private int miles;
	
	public Flight(double price, int miles) {
		this.price = price;
		this.miles = miles;
	}

	public double getPrice() {
		return price;
	}

	public int getMiles() {
		return miles;
	}
}