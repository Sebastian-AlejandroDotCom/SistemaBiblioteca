package com.biblioteca.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Libro_Idioma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLibroIdioma;
    private Integer libro;
    private Integer idioma;

    public Integer getIdLibroIdioma() {
        return idLibroIdioma;
    }

    public void setIdLibroIdioma(Integer idLibroIdioma) {
        this.idLibroIdioma = idLibroIdioma;
    }

    public Integer getLibro() {
        return libro;
    }

    public void setLibro(Integer libro) {
        this.libro = libro;
    }

    public Integer getIdioma() {
        return idioma;
    }

    public void setIdioma(Integer idioma) {
        this.idioma = idioma;
    }
}
