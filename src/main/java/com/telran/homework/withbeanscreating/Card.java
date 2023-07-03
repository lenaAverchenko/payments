package com.telran.homework.withbeanscreating;


public class Card implements Payment {

    @Override
    public void pay() {
        System.out.println("Paying by card");
    }
}
