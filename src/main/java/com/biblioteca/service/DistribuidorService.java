package com.biblioteca.service;

import com.biblioteca.dao.DistribuidorDAO;
import com.biblioteca.dto.Distribuidor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DistribuidorService {

    @Autowired
    private DistribuidorDAO distribuidorDAO;

    public Iterable<Distribuidor> mostrarTodos() {
        return this.distribuidorDAO.findAll();
    }

    public Optional<Distribuidor> buscarPorId(Integer id){
        return this.distribuidorDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.distribuidorDAO.deleteById(id);
    }

    public void actualizar(Distribuidor distribuidor){
        this.distribuidorDAO.save(distribuidor);
    }

    public void guardar(Distribuidor distribuidor){
        this.distribuidorDAO.save(distribuidor);
    }
}
