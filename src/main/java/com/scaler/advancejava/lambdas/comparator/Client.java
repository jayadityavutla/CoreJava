package com.scaler.advancejava.lambdas.comparator;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Jay",1,93),
                new Student("Sivasai", 6, 91),
                new Student("Mary", 5, 100)
        );
        //Comparator
        Comparator<Student> marksComparator = (st1, st2) -> st1.marks - st2.marks;//Low to high marks
        Comparator<Student> rollNumberComparator = (st1, st2) -> {
            return st1.rollNumber - st2.rollNumber;
        };

        Collections.sort(students, marksComparator);
        System.out.println(students);
    }
}
