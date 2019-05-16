package com.jackwanacode;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Jack", 100);
        System.out.println("New Score is " + newScore);
        calculateScore(50);
        calculateScore("Jack", 5.5);
    }


    public static int calculateScore(String playName, int score) {
        System.out.println("Player name is " + playName +
                " scored: " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(String playName, double height) {
        System.out.println("Player name is " + playName +
                ". He's " + height + " feet tall");
        return 0;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed scored: " +
                score + " points");
        return score * 1000;
    }
}
