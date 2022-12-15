package com.example.payment.estado;

public enum Status {
    PENDING("P"), INPROGRESS("IPR"), SUCESSFULL("S"), ERROR("E"), FAIL("F");

    Status(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getAbreviatura(){
        return this.abreviatura;
    }


    private String abreviatura;
}
