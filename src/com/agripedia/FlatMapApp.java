package com.agripedia;

import java.util.List;
import java.util.stream.Stream;

public class FlatMapApp {
    public static void main(String[] args) {
        List.of("David", "Anwar", "mundzir")
                .stream()
                .flatMap(name -> Stream.of(name, name.length())) // mengubah stream ke stream yang yang lain
                .forEach(name -> System.out.println(name));
    }
}
