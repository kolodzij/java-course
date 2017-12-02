package com.kodilla.good.patterns.Flight;

public class Application {

    public static void main(String[] args) {
        FlightSearch searchFlight = new FlightSearch();
        searchFlight.addFlights(new Flight("Warszawa","Wrocław"));
        searchFlight.addFlights(new Flight("Warszawa","Kraków"));
        searchFlight.addFlights(new Flight("Gdańsk","Poznań"));
        searchFlight.addFlights(new Flight("Warszawa","Poznań"));
        searchFlight.addFlights(new Flight("Poznań","Berlin"));
        searchFlight.addFlights(new Flight("Berlin","Warszawa"));
        searchFlight.addFlights(new Flight("Warszawa","Frankfurt"));
        searchFlight.addFlights(new Flight("Frankfurt","Nowy Jork"));
        searchFlight.addFlights(new Flight("Frankfurt","Londyn"));


        System.out.println("Lot z: ");
        searchFlight.searchFlightFrom("Warszawa").stream()
                .forEach(System.out :: println);


        System.out.println("Lot do: ");
        searchFlight.searchFlightTo("Londyn").stream()
                .forEach(System.out :: println);


        System.out.println("Lot przez: ");
        searchFlight.searchFlightThrough("Poznań").stream()
                .forEach(System.out :: println);

    }
}
