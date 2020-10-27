package com.javalesson.oop.shop;

public class Sosage {
    int ID;
    Sting name;
    int size;
    int price;


    public Sosage(int ID, Sting name, int size, int price) {
        this.ID = ID;
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public Sosage getSlice(int size) {
        this.size -= size;
        return new Sosage(id + 1, name, size, price);
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Sting getName() {
        return name;
    }

    public void setName(Sting name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
