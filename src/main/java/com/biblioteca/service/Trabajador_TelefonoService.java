package com.biblioteca.service;

import com.biblioteca.dao.Trabajador_TelefonoDAO;
import com.biblioteca.dto.Trabajador_Telefono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Trabajador_TelefonoService {

    @Autowired
    private Trabajador_TelefonoDAO trabajador_telefonoDAO;

    public Iterable<Trabajador_Telefono> mostrarTodos() {
        return this.trabajador_telefonoDAO.findAll();
    }

    public Optional<Trabajador_Telefono> buscarPorId(Integer id){
        return this.trabajador_telefonoDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.trabajador_telefonoDAO.deleteById(id);
    }

    public void actualizar(Trabajador_Telefono trabajador_telefono){
        this.trabajador_telefonoDAO.save(trabajador_telefono);
    }

    public void guardar(Trabajador_Telefono trabajador_telefono){
        this.trabajador_telefonoDAO.save(trabajador_telefono);
    }
}
