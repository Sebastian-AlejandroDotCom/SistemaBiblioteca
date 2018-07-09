package com.biblioteca.service;

import com.biblioteca.dao.Compra_LibroDAO;
import com.biblioteca.dto.Compra_Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Compra_LibroService {

    @Autowired
    private Compra_LibroDAO compra_libroDAO;

    public Iterable<Compra_Libro> mostrarTodos() {
        return this.compra_libroDAO.findAll();
    }

    public Optional<Compra_Libro> buscarPorId(Integer id){
        return this.compra_libroDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.compra_libroDAO.deleteById(id);
    }

    public void actualizar(Compra_Libro compra_libro){
        this.compra_libroDAO.save(compra_libro);
    }

    public void guardar(Compra_Libro compra_libro){
        this.compra_libroDAO.save(compra_libro);
    }
}
