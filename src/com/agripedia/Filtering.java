package com.agripedia;

import java.util.List;

public class Filtering {
    public static void main(String[] args) {
        List<String> names = List.of("David", "David", "Anwar", "Mundzir", "Bocil");
//        names.stream()
//                .filter(data -> data.length() > 5)
//                .forEach(data -> System.out.println(data));
        names.stream()
                .distinct()
                .forEach(data -> System.out.println(data));
    }
}
