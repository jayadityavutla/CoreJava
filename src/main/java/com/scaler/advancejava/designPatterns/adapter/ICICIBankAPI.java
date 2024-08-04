package com.scaler.advancejava.designPatterns.adapter;

public class ICICIBankAPI {
    public void transferMoney(String fromAcc, String toAcc, double amount){
        System.out.println("ICICI Bank sending " + amount + " from account " + fromAcc + " to account " + toAcc);
    }
}
