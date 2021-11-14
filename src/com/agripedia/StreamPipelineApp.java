package com.agripedia;

import java.util.List;

public class StreamPipelineApp {
    public static void main(String[] args) {
        List<String> names = List.of("David", "Anwar", "Mundzir");
        names.stream()
                .map(data -> data.toUpperCase())
                .map(syaikh -> "Syaikh " + syaikh)
                .forEach(data -> System.out.println(data));
    }
}
