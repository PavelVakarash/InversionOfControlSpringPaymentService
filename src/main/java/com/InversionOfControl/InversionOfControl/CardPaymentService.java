package com.InversionOfControl.InversionOfControl;

import org.springframework.stereotype.Component;

@Component
public class CardPaymentService implements PaymentService{
    public void pay()
    {
        System.out.println("Pay with card");
    }
}

