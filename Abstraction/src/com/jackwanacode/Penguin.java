package com.jackwanacode;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
//        super.fly();
        System.out.println("I'm not very well at that, can I got for a swim instead");
    }
}
