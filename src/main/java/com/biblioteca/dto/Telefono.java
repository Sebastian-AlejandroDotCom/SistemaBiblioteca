package com.biblioteca.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Telefono {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTelefono;
    private String detalleTelefono;

    public Integer getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(Integer idTelefono) {
        this.idTelefono = idTelefono;
    }

    public String getDetalleTelefono() {
        return detalleTelefono;
    }

    public void setDetalleTelefono(String detalleTelefono) {
        this.detalleTelefono = detalleTelefono;
    }
}
