package com.biblioteca.service;

import com.biblioteca.dao.Estado_LibroDAO;
import com.biblioteca.dto.Estado_Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Estado_LibroService {

    @Autowired
    private Estado_LibroDAO estado_libroDAO;

    public Iterable<Estado_Libro> mostrarTodos() {
        return this.estado_libroDAO.findAll();
    }

    public Optional<Estado_Libro> buscarPorId(Integer id){
        return this.estado_libroDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.estado_libroDAO.deleteById(id);
    }

    public void actualizar(Estado_Libro estado_libro){
        this.estado_libroDAO.save(estado_libro);
    }

    public void guardar(Estado_Libro estado_libro){
        this.estado_libroDAO.save(estado_libro);
    }
}
