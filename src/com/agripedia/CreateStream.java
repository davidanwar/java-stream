package com.agripedia;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        Stream<String> emptyStream = Stream.empty();
        Stream<String> oneStream = Stream.of("David");
        String data = null;
        Stream<String> emptyOrNotZStream = Stream.ofNullable(data);
        Stream<String> arrayStream = Arrays.stream(new String[] {"David", "Anwar", "Mundzir"});
        Collection<String> collection = List.of("David", "Anwar", "Ibnu");
        Stream<String> collectionStream = collection.stream();
        arrayStream.forEach(item -> System.out.println(item));

        //////////// Infinite Stream ///////////
        Stream<String> stream = Stream.generate(() -> "David");
        Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);

    }
}
