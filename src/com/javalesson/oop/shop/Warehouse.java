package com.javalesson.oop.shop;

import java.net.Socket;

public class Warehouse {

    // количество колбас на складе
    private int countALl;
    // емкость склада
    private int capacity;
    private Sosage sausages[] = new Sosage[capacity];


    public Warehouse(int capacity) {
        this.capacity = capacity;
    }



    public boolean putSousageInWare(Sosage sosage) {
        if (countALl > capacity) {
            return false;
        } else {
            sausages[countALl] = sosage;
            countALl++;
            capacity--;
            return true;
        }
    }


    public int  getSousageIndex(String name) {
        for (int i = 0; i < capacity; i++) {
            String nameS = sausages[i].getName();
            if (name.equals(nameS)) {
                return i;
            }
        }
        return -1;
    }

    public Sosage getSousage(int index){
        if (index == -1 || index > capacity) {
            System.out.println("Нас обманывают");
        }
        return sausages[index];

    }


}
