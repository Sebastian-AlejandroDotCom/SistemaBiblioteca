package com.biblioteca.service;

import com.biblioteca.dao.Libro_AutorDAO;
import com.biblioteca.dto.Libro_Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Libro_AutorService {

    @Autowired
    private Libro_AutorDAO libro_autorDAO;

    public Iterable<Libro_Autor> mostrarTodos() {
        return this.libro_autorDAO.findAll();
    }

    public Optional<Libro_Autor> buscarPorId(Integer id){
        return this.libro_autorDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.libro_autorDAO.deleteById(id);
    }

    public void actualizar(Libro_Autor libro_autor){
        this.libro_autorDAO.save(libro_autor);
    }

    public void guardar(Libro_Autor libro_autor){
        this.libro_autorDAO.save(libro_autor);
    }
}
