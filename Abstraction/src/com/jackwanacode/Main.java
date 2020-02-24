package com.jackwanacode;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Bird parrot = new Parrot("Parrot");
        parrot.eat();
        parrot.breathe();
        parrot.fly();

        Penguin penguin = new Penguin("Penguin");
        penguin.eat();
        penguin.breathe();
        penguin.fly();
    }
}
