package com.agripedia;

import java.util.Comparator;
import java.util.List;

public class OrderingOperation {
    public static void main(String[] args) {
        Comparator<String> comparator = Comparator.reverseOrder();
                List.of("David", "Anwar", "Mundzir", "Bocil")
                .stream()
                .sorted()
                .forEach(data -> System.out.println(data));

                //////////// Comparator Sendiri /////////
        List.of("David", "Anwar", "Mundzir", "Bocil")
                .stream()
                .sorted(comparator)
                .forEach(data -> System.out.println(data));

    }
}
