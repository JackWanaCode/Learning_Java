package com.jackwanacode;

public class Main {

    public static void main(String[] args) {
        Car camry = new Car();
        camry.setDoor(4);
        System.out.println(camry.getDoor());

        Car prius = new Car();
        prius.setDoor(5);
        System.out.println(prius.getDoor());
    }
}
