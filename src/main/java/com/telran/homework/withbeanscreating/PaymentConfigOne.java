package com.telran.homework.withbeanscreating;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfigOne {

    @Bean
    public Cash cash(){
        return new Cash();
    }

    @Bean
    public Check check(){
        return new Check();
    }

    @Bean
    public Card card(){
        return new Card();
    }

    @Bean
    public PaymentService paymentService(){
        return new PaymentService();
    }
}
