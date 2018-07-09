package com.biblioteca.service;

import com.biblioteca.dao.CorreoDAO;
import com.biblioteca.dto.Correo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CorreoService {

    @Autowired
    private CorreoDAO correoDAO;

    public Iterable<Correo> mostrarTodos() {
        return this.correoDAO.findAll();
    }

    public Optional<Correo> buscarPorId(Integer id){
        return this.correoDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.correoDAO.deleteById(id);
    }

    public void actualizar(Correo correo){
        this.correoDAO.save(correo);
    }

    public void guardar(Correo correo){
        this.correoDAO.save(correo);
    }
}
