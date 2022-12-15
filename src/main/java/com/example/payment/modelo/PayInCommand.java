package com.example.payment.modelo;

import com.example.payment.comand.PaymentCommand;
import com.example.payment.servicio.ServicePay;
import org.springframework.beans.factory.annotation.Autowired;

public class PayInCommand extends PaymentCommand {
    @Autowired
    private ServicePay servicePay;
    @Override
    public Pay Execute(Pay payEntrada){
        return Validacion(payEntrada);
    }
    @Override
    public Pay Validacion(Pay validarPay) {
        return Process(validarPay);
    }
    @Override
    public Pay Process(Pay envioProces) {
        return servicePay.guardarPayment(envioProces);
    }
}
