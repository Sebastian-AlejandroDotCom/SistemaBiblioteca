package com.biblioteca.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Metodo_Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMetodoPago;
    private String detalleMetodoPago;

    public Integer getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(Integer idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public String getDetalleMetodoPago() {
        return detalleMetodoPago;
    }

    public void setDetalleMetodoPago(String detalleMetodoPago) {
        this.detalleMetodoPago = detalleMetodoPago;
    }
}
