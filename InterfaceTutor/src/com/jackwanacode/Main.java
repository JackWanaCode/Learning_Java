package com.jackwanacode;

public class Main {

    public static void main(String[] args) {
	    ITelephone timPhone;
	    timPhone = new DeskPhone(123456);
	    timPhone.powerOn();
	    timPhone.callPhone(123456);
	    timPhone.answer();

	    timPhone = new MobilePhone(123456789);
	    timPhone.powerOn();
	    timPhone.callPhone(234567);
	    timPhone.answer();
    }
}
