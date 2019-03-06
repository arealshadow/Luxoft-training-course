package com.luxoft.jva007.BankApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.luxoft.jva007.BankApp.Client;
import  com.luxoft.jva007.BankApp.Account;

/**
 * BankApplication
 */
public class BankApplication {

     private static Bank bank;


    public Bank getBank() {
        return bank;
    }
        private static void modifyBank() {
            if (bank.clients.get(0).startingAccount.getBalance() >= 100.0) {
                bank.clients.get(0).startingAccount.deposit(200.0);
                System.out.println("Modified balance for our clients is now; " + bank.clients.get(0).startingAccount.getBalance());
            } else {
                bank.clients.get(0).startingAccount.withdraw(50.0);
            }
        }

    private static void printBalance(){
        for (int i=0; i < bank.clients.size(); i++){
            System.out.println("Your clients balance is: " + bank.clients.get(0).startingAccount.getBalance());
        }
}
    public static void checkGender() {
        for (int i = 0; i < bank.clients.size(); i++){
            bank.clients.get(i).getClientGreeting();
        }
    }
    
    public static void main(String[] args) {

        bank = new Bank();
        bank.addClient(new Client("Michael", Client.Gender.MALE));
        bank.addClient(new Client("Jenna", Client.Gender.FEMALE));

        checkGender();
        modifyBank();
        printBalance();






    }
}