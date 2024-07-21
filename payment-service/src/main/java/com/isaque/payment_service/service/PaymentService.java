package com.isaque.payment_service.service;

import com.isaque.payment_service.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
