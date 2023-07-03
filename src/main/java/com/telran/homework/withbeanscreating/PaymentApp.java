package com.telran.homework.withbeanscreating;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PaymentApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PaymentConfigOne.class);

        PaymentService paymentService = context.getBean(PaymentService.class);
        paymentService.pay(PaymentType.CARD);
        paymentService.pay(PaymentType.CASH);
        paymentService.pay(PaymentType.CHECK);
    }
}
