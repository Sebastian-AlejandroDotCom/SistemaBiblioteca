package com.biblioteca.service;

import com.biblioteca.dao.Libro_IdiomaDAO;
import com.biblioteca.dto.Libro_Idioma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Libro_IdiomaService {

    @Autowired
    private Libro_IdiomaDAO libro_idiomaDAO;

    public Iterable<Libro_Idioma> mostrarTodos() {
        return this.libro_idiomaDAO.findAll();
    }

    public Optional<Libro_Idioma> buscarPorId(Integer id){
        return this.libro_idiomaDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.libro_idiomaDAO.deleteById(id);
    }

    public void actualizar(Libro_Idioma libro_idioma){
        this.libro_idiomaDAO.save(libro_idioma);
    }

    public void guardar(Libro_Idioma libro_idioma){
        this.libro_idiomaDAO.save(libro_idioma);
    }
}
