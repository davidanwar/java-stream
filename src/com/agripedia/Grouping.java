package com.agripedia;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grouping {
    public static void main(String[] args) {
        Map<String, List<Integer>> map = Stream.of(1,2,3,4,5,6,7,8,9,10)
                .collect(Collectors.groupingBy(data -> data > 5 ? "Besar" : "kecil"));
        System.out.println(map);

        /////////// Patitioning ////////////////
        // Hanya membagi dua group dan mengembalikan nilai boolean
        Map<Boolean, List<Integer>> partitioning = Stream.of(1,2,3,4,5,6,7,8,9,10)
                .collect(Collectors.partitioningBy(data -> data > 5 ? true : false));
        System.out.println(partitioning);
    }
}
