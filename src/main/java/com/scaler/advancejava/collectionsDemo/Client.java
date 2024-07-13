package com.scaler.advancejava.collectionsDemo;

import java.util.*;

enum PaymentStatus{
    SUCCESS,
    FAILURE,
    PENDING,
    AWAITING_APPROVAL
}

public class Client {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.remove(2);
        set.add(3);
        //System.out.println(set);

        EnumSet<PaymentStatus> pStatus = EnumSet.of(PaymentStatus.SUCCESS, PaymentStatus.PENDING);
        //System.out.println(pStatus);
        EnumSet<PaymentStatus> allOf = EnumSet.allOf(PaymentStatus.class);
        // Iterating over the EnumSet
        for (PaymentStatus status : allOf) {
            //System.out.println(status);
        }

        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Jay", 24, 100),
                new Student("Dheeraj", 28, 98)
        ));
        students.sort(new StudentSorter());
        System.out.println(students.get(0).getName());
    }
}
