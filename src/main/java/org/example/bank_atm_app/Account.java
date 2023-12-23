package org.example.bank_atm_app;

public class Account {
    private static int balance=6000;
    public  int getBalance() {
        return balance;
    }
    public  void  withdraw(int amount) {
        balance = balance - amount;
    }
}
