package com.javalesson.oop.shop;

public class Milk {
    int ID;
    float FatContent; //жирность молока
    String MilkName;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFatContent(float fatContent) {
        this.FatContent = fatContent;
    }

    public void setMilkName(String milkName) {
        this.MilkName = milkName;
    }

    public void setMilkPrice(int milkPrice) {
        this.MilkPrice = milkPrice;
    }

    int MilkPrice;

    public int getID() {
        return ID;
    }

    public float getFatContent() {
        return FatContent;
    }

    public String getMilkName() {
        return MilkName;
    }

    public int getMilkPrice() {
        return MilkPrice;
    }



}
