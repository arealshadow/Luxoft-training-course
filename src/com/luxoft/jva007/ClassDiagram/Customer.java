package com.luxoft.jva007.ClassDiagram;

public class Customer {
    private String name;
    private String surname;
    private int billingInfo;

    Receipt receiptInfo = new Receipt(523);

    public Customer(String name, String surname, int billingInfo) {
        System.out.println("Constructing a customer");
        this.name = name;
        this.surname = surname;
        this.billingInfo = billingInfo;

    }
    public void sendRecepit(){
        System.out.println("Sending receipt number " + getReceiptInfo() + " to " + toString() + ", has to pay the amount of " + getBillingInfo());
    }
    public String toString(){
        return getName() + " " + getSurname();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }1

    public int getBillingInfo() {
        return billingInfo;
    }


    public int getReceiptInfo() {
        return receiptInfo.getReceiptNumber();
    }
}
