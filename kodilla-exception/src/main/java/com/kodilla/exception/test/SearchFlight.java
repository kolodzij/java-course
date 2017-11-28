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

        Boolean kk= airportsMap.containsKey(flight.getArrivalAirport());

        if (!airportsMap.containsKey(flight.getArrivalAirport()) || !airportsMap.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException();
        }
        else {
            if (airportsMap.get(flight.getArrivalAirport())) {
                System.out.println("Flight " +flight.getDepartureAirport() + " - " + flight.getArrivalAirport() + " is possible.");
            }
            else {
                System.out.println("Airport " +flight.getArrivalAirport() + " is closed");
            }
        };

    }
}
