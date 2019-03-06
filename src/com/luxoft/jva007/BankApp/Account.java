package com.luxoft.jva007.BankApp;

/**
 * BankAccount
 */
public class Account {

        public int id;
        public double balance;

        public Account(int id, double balance) {
            this.id = id;
            this.balance = balance;
        }

        public double getBalance(){
            return balance;
        }
        public void deposit(double amount){
            balance += amount;
        }
        public void withdraw(double amount){
            if (amount >= balance) {
                System.out.println("Withdrawl amount exceeded account balance");
                return;
              }
              balance = balance - amount;
        }


    
}