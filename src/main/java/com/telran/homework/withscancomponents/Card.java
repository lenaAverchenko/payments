package com.telran.homework.withscancomponents;

import org.springframework.stereotype.Component;

@Component
public class Card implements Payment {

    @Override
    public void pay() {
        System.out.println("Paying by card");
    }
}
