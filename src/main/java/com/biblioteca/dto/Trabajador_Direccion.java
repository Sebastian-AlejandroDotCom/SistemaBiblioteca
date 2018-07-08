package com.biblioteca.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trabajador_Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTrabajadorDireccion;
    private Integer trabajador;
    private Integer direccion;

    public Integer getIdTrabajadorDireccion() {
        return idTrabajadorDireccion;
    }

    public void setIdTrabajadorDireccion(Integer idTrabajadorDireccion) {
        this.idTrabajadorDireccion = idTrabajadorDireccion;
    }

    public Integer getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Integer trabajador) {
        this.trabajador = trabajador;
    }

    public Integer getDireccion() {
        return direccion;
    }

    public void setDireccion(Integer direccion) {
        this.direccion = direccion;
    }
}
