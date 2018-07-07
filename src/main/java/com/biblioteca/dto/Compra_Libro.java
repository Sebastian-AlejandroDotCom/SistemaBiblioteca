package com.biblioteca.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Compra_Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCompraLibro;
    private Integer compra;
    private Integer libro;

    public Integer getIdCompraLibro() {
        return idCompraLibro;
    }

    public void setIdCompraLibro(Integer idCompraLibro) {
        this.idCompraLibro = idCompraLibro;
    }

    public Integer getCompra() {
        return compra;
    }

    public void setCompra(Integer compra) {
        this.compra = compra;
    }

    public Integer getLibro() {
        return libro;
    }

    public void setLibro(Integer libro) {
        this.libro = libro;
    }
}
