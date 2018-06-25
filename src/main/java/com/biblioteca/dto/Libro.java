package com.biblioteca.dto;



import javax.persistence.*;
import java.sql.Date;

@Entity
public class Libro {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer numeroSerie;
    @Column(name = "ISBN")
    private String isbn;
    private String titulo;
    private int paginas;
    private int precio;
    private Date año;
    private Date publicacion;
    private Integer editorial;

    public Integer getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(Integer numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Date getAnno() {
        return año;
    }

    public void setAnno(Date año) {
        this.año = año;
    }

    public Date getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Date publicacion) {
        this.publicacion = publicacion;
    }

    public Integer getEditorial() {
        return editorial;
    }

    public void setEditorial(Integer editorial) {
        this.editorial = editorial;
    }
}
