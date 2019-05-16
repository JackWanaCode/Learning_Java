package com.jackwanacode;

public class Main {

    public static void main(String[] args) {
        Account jackAcount = new Account("1234", 500.0,"Jack",
                "myemail@gmail.com", "7141234567");

        System.out.println(jackAcount.getNumber());
        System.out.println(jackAcount.getBalance());
        System.out.println(jackAcount.getCustomerName());
        System.out.println(jackAcount.getCustomerEmailAddress());
        System.out.println(jackAcount.getCustomerPhoneNumber());

        jackAcount.deposit(1000.0);
        jackAcount.withdrawal(543);
        jackAcount.withdrawal(1000);
    }
}
