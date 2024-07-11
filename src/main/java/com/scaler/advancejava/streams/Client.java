package com.scaler.advancejava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

        Stream<Integer> stream = list.stream();

        Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6,7);

        Stream.Builder<Integer> stream3 = Stream.builder();
        stream3.add(1);
        stream3.add(2);
        stream3.add(3);

        //System.out.println(stream3.toString());
    }
}
