package com.scaler.advancejava.lambdas.runnable;

import java.util.function.*;

public class Client {
    public static void main(String[] args) {
        //Way1
        SampleClass obj = new SampleClass();
        obj.func();

        //Way2 - Anonymous class
        SampleFunctionalInterface obj2 = new SampleFunctionalInterface() {
            @Override
            public void func() {
                System.out.println("Anonymous class");
            }
        };
        obj2.func();

        //Way3 - Lambda Expression
        SampleFunctionalInterface obj3 = () -> System.out.println("Anonymous class");

        //Predefined Classes in function package
        BiConsumer<String, Integer> biConsumer = new BiConsumer<String, Integer>(){
            @Override
            public void accept(String s, Integer integer) {
                System.out.println("String is " + s + " and integer is " + integer );
            }
        };
        biConsumer.accept("Jay",100);

        BiConsumer<String,Integer> biCon2 = (x, y) -> System.out.println("String is " + x + " and integer is " + y);
        biCon2.accept("Siv",23);

        Consumer<String> consumer = (str) -> System.out.println("String is " + str);
        consumer.accept("Tamil");

        BinaryOperator<Integer> binaryOperator = (x, y) -> x + y;
        System.out.println("Addition using BinaryOperator Class is " + binaryOperator.apply(2,5));

        Predicate<String> predicate = (str) -> str.startsWith("T");//Gives boolean as return
        System.out.println("check whether string starts with T " + predicate.test("Fire"));

        BiPredicate<String,Integer> biPredicate = (x, y) -> x.length() > y;
        System.out.println("Validate the given string length is more than 10 is "+biPredicate.test("ScalerCourse",10));
    }
}
