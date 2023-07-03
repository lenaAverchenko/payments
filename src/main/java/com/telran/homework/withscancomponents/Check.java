package com.telran.homework.withscancomponents;

import org.springframework.stereotype.Component;

@Component
public class Check implements Payment {

    @Override
    public void pay() {
        System.out.println("Paying with check");
    }
}
