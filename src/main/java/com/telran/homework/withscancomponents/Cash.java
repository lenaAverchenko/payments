package com.telran.homework.withscancomponents;

import org.springframework.stereotype.Component;

@Component
public class Cash implements Payment {

    @Override
    public void pay() {
        System.out.println("Paying by cash");

    }
}
