package com.example.payment.Builder;

import com.example.payment.comand.PaymentCommand;
import com.example.payment.modelo.Pay;
import org.springframework.beans.factory.annotation.Autowired;

public class BuilderPay {
    @Autowired
    private PaymentCommand paymentC;
    public void setPaymentBuilder(PaymentCommand pc){
        paymentC=  pc;
    }
    public Pay construirPay(Pay payment){
        return paymentC.Execute(payment);
    }
}
