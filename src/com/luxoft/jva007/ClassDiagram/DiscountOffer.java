package com.luxoft.jva007.ClassDiagram;

public class DiscountOffer {
    Customer customer = new Customer("George", "Ionescu", 300);

    public int getCustomerInfo() {
        return customer.getReceiptInfo();
    }

    public void checkForDiscount() {
        if (getCustomerInfo() > 100) {
            System.out.println("Customer is offered a 40% discount. He now has to pay: " + ((40 * 100) / customer.getBillingInfo()) + "$");
        } else {
            System.out.println("Customer will not receive a discount.");
        }
    }
}
