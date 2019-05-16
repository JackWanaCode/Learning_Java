package com.jackwanacode;

public class Account {
    private String number;
    private Double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(String number, Double balance, String customerName,
                        String customerEmailAddress, String customerPhoneNumber) {
        setBalance(balance);
        setNumber(number);
        setCustomerEmailAddress(customerEmailAddress);
        setCustomerName(customerName);
        setCustomerPhoneNumber(customerPhoneNumber);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (number.length() > 1) {
            this.number = number;
        } else {
            System.out.println("Invalid number");
        }
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        if (balance > 0.0) {
            this.balance = balance;
        } else {
            System.out.println("initializing balance less than 0");
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        if (customerName.length() > 1) {
            this.customerName = customerName;
        } else {
            System.out.println("Invalid Name");
        }
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        if (customerEmailAddress.length() > 1) {
            this.customerEmailAddress = customerEmailAddress;
        } else {
            System.out.println("Invalid email address");
        }

    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        if (customerPhoneNumber.length() > 1) {
            this.customerPhoneNumber = customerPhoneNumber;
        } else {
            System.out.println("Invalid phone number");
        }
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Your balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance >= withdrawalAmount) {
            this.balance -= withdrawalAmount;
            System.out.println("You has withdrawn " + withdrawalAmount +
                    ", your balance is " + this.balance);
        } else {
            System.out.println("There is not enough money in your account, your balance is " + this.balance);
        }
    }
}
