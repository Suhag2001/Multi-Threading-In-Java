package org.example.bank_atm_app;

public class Client {
    public static void main(String[] args) {
        Account account = new Account();
        AccountHolder accountHolder = new AccountHolder(account,2000);
        Thread t1 = new Thread(accountHolder);
        Thread t2 = new Thread(accountHolder);
        t1.setName("Prashant");
        t2.setName("Vaibhav");
        t1.start();
        t2.start();
    }
}
