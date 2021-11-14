package com.agripedia;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveStream {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 100);
        intStream.forEach(data -> System.out.println(data));
        DoubleStream.of(1,2,4,5,6).forEach(System.out::println);
        OptionalDouble average = IntStream.range(1, 100).average();
        average.ifPresent(System.out::println);
    }
}
