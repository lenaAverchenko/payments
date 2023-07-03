package com.telran.homework.withbeanscreating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PaymentService {

    @Autowired
    private Payment cash;
    @Autowired
    private Payment check;
    @Autowired
    private Payment card;


    public void pay(PaymentType paymentType){
        switch (paymentType){
            case CARD -> card.pay();
            case CHECK -> check.pay();
            case CASH -> cash.pay();
            default -> System.out.println("Wrong definer");
        }
    }
}
