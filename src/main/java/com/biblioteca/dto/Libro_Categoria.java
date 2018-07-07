package com.biblioteca.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Libro_Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLibroCategoria;
    private Integer libro;
    private Integer categoria;

    public Integer getIdLibroCategoria() {
        return idLibroCategoria;
    }

    public void setIdLibroCategoria(Integer idLibroCategoria) {
        this.idLibroCategoria = idLibroCategoria;
    }

    public Integer getLibro() {
        return libro;
    }

    public void setLibro(Integer libro) {
        this.libro = libro;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }
}
