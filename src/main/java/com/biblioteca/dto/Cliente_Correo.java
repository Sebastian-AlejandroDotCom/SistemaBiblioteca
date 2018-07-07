package com.biblioteca.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente_Correo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClienteCorreo;
    private Integer cliente;
    private Integer correo;

    public Integer getIdClienteCorreo() {
        return idClienteCorreo;
    }

    public void setIdClienteCorreo(Integer idClienteCorreo) {
        this.idClienteCorreo = idClienteCorreo;
    }

    public Integer getCliente() {
        return cliente;
    }

    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }

    public Integer getCorreo() {
        return correo;
    }

    public void setCorreo(Integer correo) {
        this.correo = correo;
    }
}
