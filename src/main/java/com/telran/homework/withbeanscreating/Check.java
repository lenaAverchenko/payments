package com.telran.homework.withbeanscreating;


public class Check implements Payment {

    @Override
    public void pay() {
        System.out.println("Paying with check");
    }
}
