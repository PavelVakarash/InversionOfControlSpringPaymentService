package com.InversionOfControl.InversionOfControl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class BookingTicketsService {
    private PaymentService PaymentService;

    @Autowired
    public void setPaymentService(PaymentService paymentService)
    {
        this.PaymentService = paymentService;
    }
    public void bookTicket()
    {
        System.out.println("Booking ticket...");
        PaymentService.pay();
    }
}