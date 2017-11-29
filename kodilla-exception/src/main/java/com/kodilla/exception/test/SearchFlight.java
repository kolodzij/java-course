package com.kodilla.exception.test;

import java.util.HashMap;

public class SearchFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String,Boolean> airportsMap = new HashMap<>();
        airportsMap.put("WAW",true);
        airportsMap.put("WRO",true);
        airportsMap.put("JFK",true);
        airportsMap.put("GDN",false);
        airportsMap.put("FRA",true);
        airportsMap.put("BRU",true);

        if (!airportsMap.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        }
        if (!airportsMap.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException();
        }
            if (!airportsMap.get(flight.getArrivalAirport())) {
                System.out.println("Airport " +flight.getArrivalAirport() + " is closed");
            }
            System.out.println("Flight " +flight.getDepartureAirport() + " - " + flight.getArrivalAirport() + " is possible.");
    }
}
