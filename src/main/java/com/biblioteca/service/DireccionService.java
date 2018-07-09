package com.biblioteca.service;

import com.biblioteca.dao.DireccionDAO;
import com.biblioteca.dto.Direccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DireccionService {

    @Autowired
    private DireccionDAO direccionDAO;

    public Iterable<Direccion> mostrarTodos() {
        return this.direccionDAO.findAll();
    }

    public Optional<Direccion> buscarPorId(Integer id){
        return this.direccionDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.direccionDAO.deleteById(id);
    }

    public void actualizar(Direccion direccion){
        this.direccionDAO.save(direccion);
    }

    public void guardar(Direccion direccion){
        this.direccionDAO.save(direccion);
    }
}
