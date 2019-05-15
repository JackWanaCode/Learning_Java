package com.jackwanacode;

public class Main {

    public static void main(String[] args) {

        //int has a width of 32
        int myValue = -2_147_483_648;

        //byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte)(myByteValue/2);

        //short has a width of 16
        short myShortValue = 32767;

        //long has width of 64
        long myLongValue = 100L;

        System.out.println(myValue);
        System.out.println(myByteValue);
        System.out.println(myNewByteValue);
        System.out.println(myShortValue);
        System.out.println(myLongValue);
    }
}
