package com.biblioteca.service;

import com.biblioteca.dao.Arriendo_LibroDAO;
import com.biblioteca.dto.Arriendo_Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Arriendo_LibroService {

    @Autowired
    private Arriendo_LibroDAO arriendo_libroDAO;

    public Iterable<Arriendo_Libro> mostrarTodos() {
        return this.arriendo_libroDAO.findAll();
    }

    public Optional<Arriendo_Libro> buscarPorId(Integer id) {
        return this.arriendo_libroDAO.findById(id);
    }

    public void eliminarPorId(Integer id) {
        this.arriendo_libroDAO.deleteById(id);
    }

    public void actualizar(Arriendo_Libro arriendo_libro) {
        this.arriendo_libroDAO.save(arriendo_libro);
    }

    public void guardar(Arriendo_Libro arriendo_libro) {
        this.arriendo_libroDAO.save(arriendo_libro);
    }
}
