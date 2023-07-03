package com.telran.homework.withbeanscreating;


public class Cash implements Payment {

    @Override
    public void pay() {
        System.out.println("Paying by cash");

    }
}
