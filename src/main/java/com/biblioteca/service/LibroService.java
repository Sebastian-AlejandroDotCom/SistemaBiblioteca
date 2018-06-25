package com.biblioteca.service;

import com.biblioteca.dao.LibroDAO;
import com.biblioteca.dto.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    @Autowired
    private LibroDAO libroDAO;

    public Iterable<Libro>  mostrarTodos (){
        return this.libroDAO.findAll();
    }

    public Libro buscarPorIsbn(String isbn){
        return this.libroDAO.findByIsbn(isbn);
    }

    public void actualizar(Libro libro){
        this.libroDAO.save(libro);
    }

    public void guardar(Libro libro){
        this.libroDAO.save(libro);
    }

    public void eliminar(String isbn){
        this.libroDAO.deleteByIsbn(isbn);
    }
}
