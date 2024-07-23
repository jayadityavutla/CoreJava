package com.scaler.advancejava.designPatterns.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DatabaseConnection {
    private static DatabaseConnection instance = null;
    //private static DatabaseConnection instance = new DatabaseConnection();

    private DatabaseConnection() {

    }

    //For multithreaded
    public static DatabaseConnection getInstance() {
        if(instance == null){
            synchronized (DatabaseConnection.class){
                if(instance == null){
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    //For single threaded
//    public static DatabaseConnection getInstance(){
//        if(instance == null){
//            instance = new DatabaseConnection();
//        }
//        return instance;
//    }
}
