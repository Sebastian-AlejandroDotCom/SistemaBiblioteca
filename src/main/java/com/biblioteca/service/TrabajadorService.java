package com.biblioteca.service;

import com.biblioteca.dao.TrabajadorDAO;
import com.biblioteca.dto.Trabajador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TrabajadorService {

    @Autowired
    private TrabajadorDAO trabajadorDAO;

    public Iterable<Trabajador> mostrarTodos() {
        return this.trabajadorDAO.findAll();
    }

    public Optional<Trabajador> buscarPorId(Integer id){
        return this.trabajadorDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.trabajadorDAO.deleteById(id);
    }

    public void actualizar(Trabajador trabajador){
        this.trabajadorDAO.save(trabajador);
    }

    public void guardar(Trabajador trabajador){
        this.trabajadorDAO.save(trabajador);
    }
}
