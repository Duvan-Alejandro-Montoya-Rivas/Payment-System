package com.example.payment.modelo;

import com.example.payment.estado.Status;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="pago")
public class Pay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;
    @Column(name="nombreCustomer")
    String nombreCustomer;
    @Column(name="idCustomer")
    long idCustomer;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Date")
    Date date;
    @Column(name="idSeller")
    long idSeller;
    @Column(name="mount")
    long mount;
    @Column(name="idOrder")
    long idOrder;

    public Pay(long id, String nombreCustomer, long idCustomer, Date date, long idSeller, long mount, long idOrder) {
        this.id = id;
        this.nombreCustomer = nombreCustomer;
        this.idCustomer = idCustomer;
        this.date = date;
        this.idSeller = idSeller;
        this.mount = mount;
        this.idOrder = idOrder;
    }

    public Pay() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreCustomer() {
        return nombreCustomer;
    }

    public void setNombreCustomer(String nombreCustomer) {
        this.nombreCustomer = nombreCustomer;
    }

    public long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(long idSeller) {
        this.idSeller = idSeller;
    }

    public long getMount() {
        return mount;
    }

    public void setMount(long mount) {
        this.mount = mount;
    }

    public long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(long idOrder) {
        this.idOrder = idOrder;
    }
}