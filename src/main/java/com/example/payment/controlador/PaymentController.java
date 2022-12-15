package com.example.payment.controlador;
import com.example.payment.servicio.ServicePay;
import com.example.payment.modelo.Pay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private ServicePay servicePay;

    @GetMapping
    public List<Pay> obtenerPayment(){
        return servicePay.ObtenerPayments();
    }

    @PostMapping
    public Pay guardarPayment(@RequestBody Pay payment){
        return servicePay.guardarPayment(payment);
    }
    @GetMapping(path = "/{id}")
    public Optional<Pay> obtenerPayment(@PathVariable("id")Long id){
        return this.servicePay.obtenerPorId(id);
    }

    @DeleteMapping(path="{id}")
    public String eliminarPayment(@PathVariable("id")Long id){
        boolean ok = this.servicePay.eliminarPayment(id);
        if(ok){
            return "elimindado"+id;
        }else{
            return "no eliminado usuario "+id;
        }
    }
    @GetMapping(path = "/prueba/{id}")
    public List<Pay> obtenerPaymentPorId(@PathVariable("id")Long id){
        return this.servicePay.ObtenerTodosPorId(id);
    }
}
