package com.agripedia;

import java.util.List;

public class RetrievingApp {
    public static void main(String[] args) {

        /////////// Limit ////////////////
//        List.of("David", "Anwar", "Mundzir", "Bocil")
//                .stream()
//                .limit(2)
//                .forEach(data -> System.out.println(data));

        /////////////// Skip ///////////////
//        List.of("David", "Anwar", "Mundzir", "Bocil")
//                .stream()
//                .skip(2)
//                .forEach(data -> System.out.println(data));



        ///////////// Take While ///////////////
//        List.of("David", "Anwar", "Mundzir", "Bocil")
//                .stream()
//                .takeWhile(data -> data.length() > 5 ) // tidak mengecek semua
//                .forEach(data -> System.out.println(data));


        ///////////// Drop While ///////////////
        List.of("David", "Anwar", "Mundzir", "Bocil")
                .stream()
                .dropWhile(data -> data.length() <= 5 ) // tidak mengecek semua
                .forEach(data -> System.out.println(data));
    }

}
