package com.kodilla.good.patterns.challenges;

public class MovieStoreRunner {

    public static void main(String[] args) {
        MovieStore.getMovies().entrySet().stream()
                .map(entry->entry.getKey()+ " " + entry.getValue() + " ! ")
                .forEach(System.out::print);
    }
}
