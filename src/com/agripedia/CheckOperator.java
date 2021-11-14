package com.agripedia;

import java.util.List;

public class CheckOperator {
    public static void main(String[] args) {
        boolean anyMatch = List.of(1,3,4,76,34,12,87, 30)
                .stream()
                .anyMatch(data -> data > 30);
        System.out.println(anyMatch);

        boolean allMatch = List.of(1,3,4,76,34,12,87, 30)
                .stream()
                .allMatch(data -> data > 30);
        System.out.println(allMatch);

        boolean notMatch = List.of(1,3,4,76,34,12,87, 30)
                .stream()
                .noneMatch(data -> data > 30);
        System.out.println(notMatch);

    }
}
