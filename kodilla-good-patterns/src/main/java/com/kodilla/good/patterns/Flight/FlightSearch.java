package com.kodilla.good.patterns.Flight;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FlightSearch {

    ArrayList<Flight> availbeFlights = new ArrayList<Flight>();

    public void addFlights(Flight flight) {
        this.availbeFlights.add(flight);
    }

    public ArrayList<Flight> searchFlightFrom(String departure) {
        return this.availbeFlights.stream()
                .filter(f->f.getDepartureAirport()==departure)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Flight> searchFlightTo(String arrival) {
        return this.availbeFlights.stream()
                .filter(f->f.getArrivalAirport()==arrival)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Flight> searchFlightThrough(String through) {
        ArrayList<Flight> a = searchFlightFrom(through);
        ArrayList<Flight> b = searchFlightTo(through);
        ArrayList<Flight> ab = a.stream()
                .flatMap(ai -> b.stream()
                        .map(bi -> new Flight(bi.getDepartureAirport(), ai.getArrivalAirport())))
                .collect(Collectors.toCollection(ArrayList::new));
        return ab;
    }

}
