package com.biblioteca.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVenta;
    private Integer clienteInvolucrado;
    private Integer trabajadorInvolucrado;
    private Integer boleta;

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Integer getClienteInvolucrado() {
        return clienteInvolucrado;
    }

    public void setClienteInvolucrado(Integer clienteInvolucrado) {
        this.clienteInvolucrado = clienteInvolucrado;
    }

    public Integer getTrabajadorInvolucrado() {
        return trabajadorInvolucrado;
    }

    public void setTrabajadorInvolucrado(Integer trabajadorInvolucrado) {
        this.trabajadorInvolucrado = trabajadorInvolucrado;
    }

    public Integer getBoleta() {
        return boleta;
    }

    public void setBoleta(Integer boleta) {
        this.boleta = boleta;
    }
}
