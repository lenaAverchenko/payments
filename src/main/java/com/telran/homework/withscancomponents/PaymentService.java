package com.telran.homework.withscancomponents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    @Autowired
    @Qualifier("cash")
    private Payment paymentCash;
    @Autowired
    @Qualifier("check")
    private Payment paymentCheck;
    @Autowired
    @Qualifier("card")
    private Payment paymentCard;


    public void pay(PaymentType paymentType) {
        switch (paymentType) {
            case CARD -> paymentCard.pay();
            case CHECK -> paymentCheck.pay();
            case CASH -> paymentCash.pay();
            default -> System.out.println("Wrong definer");
        }
    }
}
