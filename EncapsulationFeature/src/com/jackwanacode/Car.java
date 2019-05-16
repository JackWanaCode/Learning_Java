package com.jackwanacode;

public class Car {
    private int door;

    public void setDoor(int door) {
        if (door == 2 || door == 4) {
            this.door = door;
        } else {
            System.out.println("Invalid door value, it will be 4 by default");
            this.door = 4; // by default
        }
    }

    public int getDoor() {
        return this.door;
    }
}
