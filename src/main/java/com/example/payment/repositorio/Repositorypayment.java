package com.example.payment.repositorio;

import com.example.payment.modelo.Pay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface Repositorypayment extends JpaRepository<Pay,Long> {
    //public List<Pay> findByIdOrden(Long idOrder);
}
