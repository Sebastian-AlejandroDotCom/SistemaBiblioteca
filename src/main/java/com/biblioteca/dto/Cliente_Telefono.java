package com.biblioteca.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente_Telefono {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClienteTelefono;
    private Integer cliente;
    private Integer telefono;

    public Integer getIdClienteTelefono() {
        return idClienteTelefono;
    }

    public void setIdClienteTelefono(Integer idClienteTelefono) {
        this.idClienteTelefono = idClienteTelefono;
    }

    public Integer getCliente() {
        return cliente;
    }

    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
}
