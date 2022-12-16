package org.example.section9.exercicio.entities;

import java.security.PublicKey;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account() {

    }
    public Account(int number, String holder){
        this.number = number;
        this.holder = holder;
    }
    public Account(int number, String holder, double balance){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public void deposit(double quantity) {
        this.balance += quantity;
    }

    public void withdraw(double quantity) {
        this.balance = (this.balance - quantity) - 5 ;
    }

    public int getNumber() {
        return number;
    }


    public String getHolder() {
        return holder;
    }


    public double getBalance() {
        return balance;
    }


    @Override
    public String toString() {
        return  "Account "+ number
                + ", Holder: " + holder
                + ", Balance: $ " + balance + "\n";
    }
}
