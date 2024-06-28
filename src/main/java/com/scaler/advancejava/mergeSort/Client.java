package com.scaler.advancejava.mergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arrayToSort = List.of(10,2,3,8,11,7);
        ExecutorService es = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(arrayToSort, es);
        Future<List<Integer>> sortedListFuture = es.submit(sorter);

        List<Integer> sortedList = sortedListFuture.get();
        for (Integer i : sortedList) {
            System.out.println(i);
        }

        es.shutdown();
    }
}
