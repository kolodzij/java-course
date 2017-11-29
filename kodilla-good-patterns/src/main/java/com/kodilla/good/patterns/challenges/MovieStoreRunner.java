package com.kodilla.good.patterns.challenges;

public class MovieStoreRunner {

    public static void main(String[] args) {
        MovieStore movieTest = new MovieStore();
        movieTest.getMovies().entrySet().stream()
                .map(entry->entry.getKey()+ " " + entry.getValue() + " ! ")
                .forEach(System.out::print);
    }
}
