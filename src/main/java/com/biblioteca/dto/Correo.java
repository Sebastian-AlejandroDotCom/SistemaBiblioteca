package com.biblioteca.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Correo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCorreo;
    private String detalleCorreo;

    public Integer getIdCorreo() {
        return idCorreo;
    }

    public void setIdCorreo(Integer idCorreo) {
        this.idCorreo = idCorreo;
    }

    public String getDetalleCorreo() {
        return detalleCorreo;
    }

    public void setDetalleCorreo(String detalleCorreo) {
        this.detalleCorreo = detalleCorreo;
    }
}
