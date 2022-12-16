package org.example.section9.exercicio;

import org.example.section9.exercicio.entities.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int number;
        double balance;
        String holder;
        Account account;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        number = Integer.parseInt(sc.nextLine());
        System.out.print("Enter account holder: ");
        holder = sc.nextLine();
        System.out.print("Is there an initial balance? (Y/N) ");
        String confirm = sc.nextLine().substring(0,1).toUpperCase();
        if (confirm.equals("Y")){
            System.out.print("Enter initial balance value: ");
            balance = Double.parseDouble(sc.nextLine());
            account = new Account(number, holder, balance);
        } else {
            account = new Account(number, holder);
        }

        System.out.println("Account data: \n"+account);

        System.out.print("Enter a deposit value: ");
        balance = Double.parseDouble(sc.nextLine());
        account.deposit(balance);

        System.out.println("Updated account data: \n" + account);

        System.out.print("Enter a withdraw value: ");
        double withDraw = Double.parseDouble(sc.nextLine());

        account.withdraw(withDraw);
        System.out.println("Updated account data: \n" + account);

    }
}
