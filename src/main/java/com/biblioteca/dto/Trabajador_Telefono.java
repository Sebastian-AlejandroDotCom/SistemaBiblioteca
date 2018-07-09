package com.biblioteca.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trabajador_Telefono {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTrabajadorTelefono;
    private Integer trabajador;
    private Integer telefono;

    public Integer getIdTrabajadorTelefono() {
        return idTrabajadorTelefono;
    }

    public void setIdTrabajadorTelefono(Integer idTrabajadorTelefono) {
        this.idTrabajadorTelefono = idTrabajadorTelefono;
    }

    public Integer getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Integer trabajador) {
        this.trabajador = trabajador;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
}
