package com.example.payment.comand;

import com.example.payment.modelo.Pay;
import org.springframework.beans.factory.annotation.Autowired;

public abstract  class PaymentCommand {
    @Autowired
    private Pay payment;
    public void CrearPayment(Pay payment1){
        payment = payment1;
    }
    public abstract Pay Execute (Pay payment);
    public abstract Pay Validacion(Pay validarPay);
    public abstract Pay Process(Pay envioProces);
}
