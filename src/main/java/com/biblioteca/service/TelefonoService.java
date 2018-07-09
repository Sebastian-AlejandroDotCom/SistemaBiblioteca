package com.biblioteca.service;

import com.biblioteca.dao.TelefonoDAO;
import com.biblioteca.dto.Telefono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TelefonoService {

    @Autowired
    private TelefonoDAO telefonoDAO;

    public Iterable<Telefono> mostrarTodos() {
        return this.telefonoDAO.findAll();
    }

    public Optional<Telefono> buscarPorId(Integer id){
        return this.telefonoDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.telefonoDAO.deleteById(id);
    }

    public void actualizar(Telefono telefono){
        this.telefonoDAO.save(telefono);
    }

    public void guardar(Telefono telefono){
        this.telefonoDAO.save(telefono);
    }
}
