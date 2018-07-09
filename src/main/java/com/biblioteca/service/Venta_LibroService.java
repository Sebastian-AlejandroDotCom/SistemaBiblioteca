package com.biblioteca.service;

import com.biblioteca.dao.Venta_LibroDAO;
import com.biblioteca.dto.Venta_Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Venta_LibroService {

    @Autowired
    private Venta_LibroDAO venta_libroDAO;

    public Iterable<Venta_Libro> mostrarTodos() {
        return this.venta_libroDAO.findAll();
    }

    public Optional<Venta_Libro> buscarPorId(Integer id){
        return this.venta_libroDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.venta_libroDAO.deleteById(id);
    }

    public void actualizar(Venta_Libro venta_libro){
        this.venta_libroDAO.save(venta_libro);
    }

    public void guardar(Venta_Libro venta_libro){
        this.venta_libroDAO.save(venta_libro);
    }
}
