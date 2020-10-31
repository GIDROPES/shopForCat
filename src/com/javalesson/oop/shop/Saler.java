package com.javalesson.oop.shop;

public class Saler {
    private int countSos;
    private Warehouse warehouse;
    // TODO: add Cash class
    // Cash cash;


    public Saler(Warehouse warehouse) {
        this.warehouse = warehouse;
    }


    public Sosage buySosage(String name, int price) {
        int indexSosage = warehouse.getSousageIndex(name);
        Sosage s = null;

        if (indexSosage != -1) {
            s = warehouse.getSousage(indexSosage);
            if (s.price == price) {
                // TODO: add realization
                // cash.addMoney(price);
                return s;
            }
        }
        return s;
    }


}
