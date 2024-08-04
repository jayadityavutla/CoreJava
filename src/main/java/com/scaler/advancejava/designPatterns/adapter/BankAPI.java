package com.scaler.advancejava.designPatterns.adapter;

public interface BankAPI {

    double getBalance(String accountNum);

    boolean sendMoney(String fromAcc, String toAcc, double amount);
}
