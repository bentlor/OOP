package com.epam.bence_szabo.oop;

import java.util.ArrayList;
import java.util.List;

public class Trip {
	private PassengerGroup passengerGroup;
	private Itinerary itinerary;
	private List<FlightTicket> tickets;
	private boolean booked = true;
	private double price;
	
	public Trip(PassengerGroup passengerGroup, Itinerary itinerary) {
		this.passengerGroup = passengerGroup;
		this.itinerary = itinerary;
		
		generateTickets();
	}

	private void generateTickets() {
		double discount = passengerGroup.getDiscount();
		tickets = new ArrayList<>();
		
		for (Flight flight : itinerary.getFlights()) {
			for (Passenger passenger: passengerGroup.getPassengers()) {
				FlightTicket ticket = new FlightTicket(discount, flight);
				this.tickets.add(ticket);
				this.price += ticket.getDiscountedPrice();
				passenger.addMiles(flight.getMiles());
			}
		}
	}
	
	public double getTotalPrice() {
		return price;
	}
	
	public void cancel() {
		booked = false;
	}
	
	public static void main(String[] args) {
		Flight f1 = new Flight(100, 20001);
		Flight f2 = new Flight(120, 30000);
		Passenger p1 = new Passenger();
		Passenger p2 = new Passenger();
		
		PassengerGroup pg = new PassengerGroup(p1, p2);
		Itinerary it = new Itinerary(f1, f2);
		
		Trip t = new Trip(pg, it);
		System.out.println("Total Discounted Price: " + t.getTotalPrice());
		System.out.println(p1.getFrequentFlyerProgram().getClass().getName());
		System.out.println(p2.getFrequentFlyerProgram().getClass().getName());
		
		Trip t2 = new Trip(pg, it);
		System.out.println("Total Discounted Price: " + t2.getTotalPrice());
		
	}

}
