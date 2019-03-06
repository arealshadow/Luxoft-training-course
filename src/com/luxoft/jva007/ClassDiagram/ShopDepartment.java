package com.luxoft.jva007.ClassDiagram;

public class ShopDepartment {
    ShopKeeper shopkeeper = new ShopKeeper("Gigel", 785);
    private String shopDepartment;
    private int departmentNumber;
    private String employees;

    public ShopDepartment(String shopDepartment, int departmentNumber, String employees) {
        this.shopDepartment = shopDepartment;
        this.departmentNumber = departmentNumber;
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Our " + shopDepartment + " shop department is number " + departmentNumber + " and whe have almost " + employees ;
    }
    public void sendShopDepartmentInfo(){
        System.out.println(toString() + ". " + shopkeeper.sendShopKeeperInfo());
    }
}
