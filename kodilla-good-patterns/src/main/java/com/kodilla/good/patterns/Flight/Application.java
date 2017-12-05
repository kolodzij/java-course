package com.kodilla.good.patterns.Flight;

public class Application {

    public static void main(String[] args) {

        FlightRepository flightRepository = new FlightRepository();

        try {
            flightRepository.addFlights(new Flight("Warszawa", "Wrocław"));
            flightRepository.addFlights(new Flight("Warszawa", "Kraków"));
            flightRepository.addFlights(new Flight("Gdańsk", "Poznań"));
            flightRepository.addFlights(new Flight("Warszawa", "Poznań"));
            flightRepository.addFlights(new Flight("Poznań", "Berlin"));
            flightRepository.addFlights(new Flight("Berlin", "Warszawa"));
            flightRepository.addFlights(new Flight("Warszawa", "Frankfurt"));
            flightRepository.addFlights(new Flight("Frankfurt", "Nowy Jork"));
            flightRepository.addFlights(new Flight("Frankfurt", "Londyn"));
        } catch (FlightAlreadyExistException e) {
            System.out.println("Podano niewłaściwe połączenie");
            return;
        }

        FlightSearch searchFlight = new FlightSearch(flightRepository);

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
