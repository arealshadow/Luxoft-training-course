package com.luxoft.jva007.ClassDiagram;

public class Shop {
    public static void main (String[] args) {
    Customer customer1 = new Customer("George", "Ionescu", 300);
    Customer customer2 = new Customer("Emil", "Petrescu", 90);
    ShopDepartment shopDepartment = new ShopDepartment("HR", 1, "100 employees");
    DiscountOffer discount = new DiscountOffer();

    customer1.sendRecepit();
    customer2.sendRecepit();
    discount.checkForDiscount();
    shopDepartment.sendShopDepartmentInfo();

    }
}
