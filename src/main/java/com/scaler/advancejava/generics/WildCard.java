package com.scaler.advancejava.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCard {

    //Unbounded Wildcard
    public static void printList(List<?> list){
        for(Object o : list){
            System.out.print(o + " ");
        }
        System.out.println();
    }
    //Upperbound Wildcard '?' can be any subclass of 'Number'
    public double sumOfList(List<? extends Number> list) {
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    //Lowerbound Wildcard '?' can be any superType of 'Integer'
    public static void addNumbers(List<? super Integer> list){
        list.add(1);
        list.add(2);
    }

    //Upperbound Generics - Animal; Pass Animal or it's subclass
    public void printAnimals(List<? extends Animal> animals){
        for(Animal animal : animals){
            System.out.println(animal.getName());
        }
    }

    //Lowerbound Generics - Animal Dog; Pass Dog or it's superclass
    public void addDogs(List<? super Dog> dogs){
        dogs.add(new Dog("Kukkalu", 6));
        dogs.add(new Dog("Pepsi", 5));
    }

}
