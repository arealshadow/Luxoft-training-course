package com.luxoft.jva007.ClassDiagram;

public class ShopKeeper {
    private String name;
    private int idBadgeNumber;

    public ShopKeeper(String name, int idBadgeNumber){
        this.name = name;
        this.idBadgeNumber = idBadgeNumber;
    }

    @Override
    public String toString() {
        return "name: " + name + ", id badge number: " + idBadgeNumber;
    }

    public String sendShopKeeperInfo(){
        return "Here's all the information about our favourite shopkeeper: " + toString() + ".";
    }
}
