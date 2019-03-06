package com.luxoft.jva007.BankApp;

/**
 * BankClient
 */
public class Client {
    
    private String name;
    public Gender gender;
    Account startingAccount;

    public enum Gender {
        MALE, FEMALE
    }

    public Client(String name, Gender gender){
        this.name = name;
        this.gender = gender;
        this.startingAccount = new Account(1, 100.0 * Math.random());
    }

    public void getClientGreeting(){
        if (gender == Gender.MALE) {
            System.out.println("His name is Mr. " + name);
        } else if (gender == Gender.FEMALE) {
            System.out.println("Her name is Ms. " + name);
        }
    }

    public String getName() {
        return name;
    }
}