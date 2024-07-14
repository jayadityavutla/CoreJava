package com.scaler.advancejava.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static <B> void main(String[] args) {
        //Generic Classes
        Pair<Integer, String> p1 = new Pair<>(23, "Venkat");
        Pair<String, Integer> p2 = new Pair<>("Sasi", 20);
//        System.out.println("First is : " + p1.getF() + " Second is : " + p1.getS());
//        System.out.println("First is : " + p2.getF() + " Second is : " + p2.getS());

        //Generic Methods - Can use for both static and non-static methods
        Integer[] intArr = {23, 45, 56, 78, 90};
        Integer lastInt = Util.getLastElement(intArr);
//        System.out.println("last element in int array is " + lastInt);

        String[] strArr = {"Jay", "Khan"};
        String lastStr = Util.getLastElement(strArr);
//        System.out.println("last element in string is " + lastStr);

        Util u = new Util();
//        u.nothing(1, "hi");

        //Inheritance Generics
        //Unbounded Wildcards
//        WildCard.printList(Arrays.asList(intArr));//List.of(intArr) also works

        Animal a1 = new Animal("Puppy", 3);
        WildCard w1 = new WildCard();
        //Upperbound Wildcard
//        System.out.println("Upperbound Wildcard " + w1.sumOfList(List.of(a1.getAge())));
        //Lowerbound Wildcaard
        //WildCard.addNumbers(List.of(1,2));

        //Upperbound with Animal Dogs classes
        List<Animal> animalList1 = new ArrayList<>();
        animalList1.add(new Animal("Kitty",1));
        animalList1.add(new Animal("Raju",8));

        List<Dog> dogList1 = new ArrayList<>();
        dogList1.add(new Dog("Puppy",3));
        dogList1.add(new Dog("Johnny",2));

        w1.printAnimals(animalList1);
        w1.printAnimals(dogList1);

        //Lowerbound with Animal Dog classes
        List<Animal> animalList2 = new ArrayList<>();
        animalList2.add(new Animal("GajaLakshmi",15));
        animalList2.add(new Animal("Seetha",2));
        w1.addDogs(animalList2);
    }
}
