package com.scaler.advancejava.designPatterns.adapter;

public class ICICIBankAdapter implements BankAPI{

    ICICIBankAPI icicibankAPI = new ICICIBankAPI();

    @Override
    public double getBalance(String accountNum) {
        return 5;
    }

    @Override
    public boolean sendMoney(String fromAcc, String toAcc, double amount) {
        icicibankAPI.transferMoney(fromAcc, toAcc, amount);
        return false;
    }
}
