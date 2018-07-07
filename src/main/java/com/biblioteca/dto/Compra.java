package com.biblioteca.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCompra;
    private Integer distribuidorInvolucrado;
    private Integer factura;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getDistribuidorInvolucrado() {
        return distribuidorInvolucrado;
    }

    public void setDistribuidorInvolucrado(Integer distribuidorInvolucrado) {
        this.distribuidorInvolucrado = distribuidorInvolucrado;
    }

    public Integer getFactura() {
        return factura;
    }

    public void setFactura(Integer factura) {
        this.factura = factura;
    }
}
