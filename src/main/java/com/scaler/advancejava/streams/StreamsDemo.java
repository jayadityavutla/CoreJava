package com.scaler.advancejava.streams;

import com.scaler.advancejava.lambdas.comparator.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Extract only odd numbers
        Stream<Integer> stream = list.stream();
        List<Integer> oddNumbers= stream.filter(e -> e%2 != 0).toList();
        System.out.println(oddNumbers);

        List<Student> students = Arrays.asList(new Student("Sasi", 4, 85),
                new Student("Rishi", 1, 80),
                new Student("Deepak", 3, 76),
                new Student("Krithi", 2, 92));

        System.out.println(students.stream().map(student -> student.name).toList());

        List<String> words = Arrays.asList("scaler", "bangalore", "india", "class", "oops", "streams", "java");
        //Count the number of words with length > 5.
        System.out.println(words.stream().filter(word -> word.length() > 4).toList());
        System.out.println("changed to UpperCase" + words.stream().map(String::toUpperCase).toList());
        System.out.println("changed to UpperCase" + words.stream().map(word -> word.toUpperCase()).toList());

        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        // What does the following code snippet do?
        String result = fruits.stream()
                .collect(Collectors.joining("| "));

        System.out.println("Result: " + result);

        List<Integer> sum = Arrays.asList(1,3,4,6,7,2);
        System.out.println(" " + sum.stream().collect(Collectors.summingInt(Integer::intValue)));
    }
}
