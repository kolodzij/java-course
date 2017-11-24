package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers){
        long avgValue = IntStream.range(0,numbers.length)
            .map(n-> numbers[n])
            .sum();
        IntStream.range(0,numbers.length)
                .map(n-> numbers[n])
                .forEach(System.out::println);

        return (double) avgValue/numbers.length;
    }
}
