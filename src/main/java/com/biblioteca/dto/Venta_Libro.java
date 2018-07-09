package com.biblioteca.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Venta_Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVentaLibro;
    private Integer venta;
    private Integer libro;

    public Integer getIdVentaLibro() {
        return idVentaLibro;
    }

    public void setIdVentaLibro(Integer idVentaLibro) {
        this.idVentaLibro = idVentaLibro;
    }

    public Integer getVenta() {
        return venta;
    }

    public void setVenta(Integer venta) {
        this.venta = venta;
    }

    public Integer getLibro() {
        return libro;
    }

    public void setLibro(Integer libro) {
        this.libro = libro;
    }
}
