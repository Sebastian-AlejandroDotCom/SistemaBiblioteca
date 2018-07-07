package com.biblioteca.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Libro_Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLibroAutor;
    private Integer libro;
    private Integer autor;

    public Integer getIdLibroAutor() {
        return idLibroAutor;
    }

    public void setIdLibroAutor(Integer idLibroAutor) {
        this.idLibroAutor = idLibroAutor;
    }

    public Integer getLibro() {
        return libro;
    }

    public void setLibro(Integer libro) {
        this.libro = libro;
    }

    public Integer getAutor() {
        return autor;
    }

    public void setAutor(Integer autor) {
        this.autor = autor;
    }
}
