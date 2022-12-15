package com.example.payment.servicio;
import com.example.payment.modelo.Pay;
import com.example.payment.repositorio.Repositorypayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ServicePay {
    @Autowired
    Repositorypayment paymentrepository;

    public ServicePay(Repositorypayment paymentrepository) {this.paymentrepository = paymentrepository;}
    public List<Pay>ObtenerPayments(){
        return paymentrepository.findAll();
    }

    public Pay guardarPayment(Pay payment){
        return paymentrepository.save(payment);}
    public Optional<Pay> obtenerPorId(Long id){
        return paymentrepository.findById(id);
    }
    public boolean eliminarPayment(Long id){
        try{
            paymentrepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public List<Pay> ObtenerTodosPorId(Long id){
        return paymentrepository.findAllById(Collections.singleton(id));
    }
}
