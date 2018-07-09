package com.biblioteca.service;

import com.biblioteca.dao.Trabajador_DireccionDAO;
import com.biblioteca.dto.Trabajador_Direccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Trabajador_DireccionService {

    @Autowired
    private Trabajador_DireccionDAO trabajador_direccionDAO;

    public Iterable<Trabajador_Direccion> mostrarTodos() {
        return this.trabajador_direccionDAO.findAll();
    }

    public Optional<Trabajador_Direccion> buscarPorId(Integer id){
        return this.trabajador_direccionDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.trabajador_direccionDAO.deleteById(id);
    }

    public void actualizar(Trabajador_Direccion trabajador_direccion){
        this.trabajador_direccionDAO.save(trabajador_direccion);
    }

    public void guardar(Trabajador_Direccion trabajador_direccion){
        this.trabajador_direccionDAO.save(trabajador_direccion);
    }
}
