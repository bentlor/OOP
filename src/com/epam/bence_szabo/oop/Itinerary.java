package com.epam.bence_szabo.oop;

import java.util.ArrayList;
import java.util.List;

public class Itinerary {
	private List<Flight> flights;
	
	public Itinerary(Flight...flights) {
		this.flights = new ArrayList<>();
		for(Flight flight : flights) {
			this.flights.add(flight);
		}
	}

	public List<Flight> getFlights() {
		return flights;
	}

}
