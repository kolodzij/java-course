package com.kodilla.exception.test;

public class FindFlightRunner {
    public static void main(String[] args) {
        Flight myFlight = new Flight("WAW","FRA");
        SearchFlight myConnection = new SearchFlight();

        try {
            myConnection.findFlight(myFlight);
        } catch (RouteNotFoundException e) {
            System.out.println("Flight is not possible");
        }
    }
}
