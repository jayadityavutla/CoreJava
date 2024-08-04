package com.scaler.advancejava.designPatterns.adapter;

public class YesBankAPI {
    public void sendingMoney(String fromAcc, String toAcc, double amount){
        System.out.println("Yes Bank sending " + amount + " from account " + fromAcc + " to account " + toAcc);
    }
}
