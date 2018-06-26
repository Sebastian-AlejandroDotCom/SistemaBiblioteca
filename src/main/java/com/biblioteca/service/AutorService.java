package com.biblioteca.service;

import com.biblioteca.dao.AutorDAO;
import com.biblioteca.dto.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorDAO autorDAO;

    public Iterable<Autor> mostrarTodos() {
        return this.autorDAO.findAll();
    }

    public Optional<Autor> buscarPorId(Integer id){
        return this.autorDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.autorDAO.deleteById(id);
    }

    public void actualizar(Autor autor){
        this.autorDAO.save(autor);
    }

    public void guardar(Autor autor){
        this.autorDAO.save(autor);
    }
}
