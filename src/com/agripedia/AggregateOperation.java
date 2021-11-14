package com.agripedia;

import java.util.Comparator;
import java.util.List;

public class AggregateOperation {
    public static void main(String[] args) {
        //////////////////// MAX ////////////////
                List.of("David", "Anwar", "Mundzir", "Bocil")
                .stream()
                .max(Comparator.naturalOrder())
                .ifPresent(data -> System.out.println(data));


        //////////////////// MIN ////////////////
        List.of("David", "Anwar", "Mundzir", "Bocil")
                .stream()
                .min(Comparator.naturalOrder())
                .ifPresent(data -> System.out.println(data));

        //////////////////// COUNT ////////////////
        long count = List.of("David", "Anwar", "Mundzir", "Bocil")
                .stream()
                .count();

        System.out.println(count);

        //////////////////// REDUCE ////////////////
        var factorial = List.of(1, 2, 3, 4, 5)
                .stream()
                .reduce(1, (value, item) -> value * item);

        System.out.println(factorial);
    }
}
