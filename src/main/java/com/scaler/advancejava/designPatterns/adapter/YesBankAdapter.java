package com.scaler.advancejava.designPatterns.adapter;

public class YesBankAdapter implements BankAPI{
    YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public double getBalance(String accountNum) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAcc, String toAcc, double amount) {
        yesBankAPI.sendingMoney(fromAcc, toAcc, amount);
        return false;
    }
}
