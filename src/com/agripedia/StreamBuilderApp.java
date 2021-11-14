package com.agripedia;

import java.util.stream.Stream;

public class StreamBuilderApp {
    public static void main(String[] args) {
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("David"); // return void
        builder.add("Anwar").add("Mundzir"); // return Builder
        Stream<String> stream = builder.build();
        stream.forEach(data -> System.out.println(data));
    }
}
