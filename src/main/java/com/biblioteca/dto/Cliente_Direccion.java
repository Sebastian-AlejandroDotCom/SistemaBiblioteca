package com.biblioteca.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente_Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClienteDireccion;
    private Integer cliente;
    private Integer direccion;

    public Integer getIdClienteDireccion() {
        return idClienteDireccion;
    }

    public void setIdClienteDireccion(Integer idClienteDireccion) {
        this.idClienteDireccion = idClienteDireccion;
    }

    public Integer getCliente() {
        return cliente;
    }

    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }

    public Integer getDireccion() {
        return direccion;
    }

    public void setDireccion(Integer direccion) {
        this.direccion = direccion;
    }
}
