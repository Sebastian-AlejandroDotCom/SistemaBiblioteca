package com.biblioteca.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Arriendo_Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idArriendoLibro;
    private Integer arriendo;
    private Integer libro;

    public Integer getIdArriendoLibro() {
        return idArriendoLibro;
    }

    public void setIdArriendoLibro(Integer idArriendoLibro) {
        this.idArriendoLibro = idArriendoLibro;
    }

    public Integer getArriendo() {
        return arriendo;
    }

    public void setArriendo(Integer arriendo) {
        this.arriendo = arriendo;
    }

    public Integer getLibro() {
        return libro;
    }

    public void setLibro(Integer libro) {
        this.libro = libro;
    }
}
