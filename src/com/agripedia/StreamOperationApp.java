package com.agripedia;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationApp {
    public static void main(String[] args) {
        List<String> list = List.of("David", "Anwar");
        Stream<String> stream = list.stream();
        Stream<String> toUpper = stream.map(data -> data.toUpperCase());
        toUpper.forEach(data -> System.out.println(data));
        list.forEach(data -> System.out.println(data
        ));

    }
}
