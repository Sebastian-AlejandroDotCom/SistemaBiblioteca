package com.biblioteca.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trabajador_Correo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTrabajadorCorreo;
    private Integer trabajador;
    private Integer correo;

    public Integer getIdTrabajadorCorreo() {
        return idTrabajadorCorreo;
    }

    public void setIdTrabajadorCorreo(Integer idTrabajadorCorreo) {
        this.idTrabajadorCorreo = idTrabajadorCorreo;
    }

    public Integer getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Integer trabajador) {
        this.trabajador = trabajador;
    }

    public Integer getCorreo() {
        return correo;
    }

    public void setCorreo(Integer correo) {
        this.correo = correo;
    }
}
