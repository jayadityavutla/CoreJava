package com.scaler.advancejava.designPatterns.adapter;

public class Phonepe {
    public static void main(String[] args) {
        BankAPI bankAPI = new ICICIBankAdapter();

        bankAPI.getBalance("123");
        bankAPI.sendMoney("123", "456", 50);
    }
}
