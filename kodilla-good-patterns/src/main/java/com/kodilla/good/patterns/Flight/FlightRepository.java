package com.kodilla.good.patterns.Flight;

import java.util.HashSet;

public class FlightRepository {

    private HashSet<Flight> availbeFlights = new HashSet<Flight>();

    public void addFlights(Flight flight) throws FlightAlreadyExistException{
        if (this.availbeFlights.contains(flight)) {
            throw new FlightAlreadyExistException();
        }
        this.availbeFlights.add(flight);
    }

    public HashSet<Flight> getAvailbeFlights() {
        return availbeFlights;
    }
}
