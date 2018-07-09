package com.biblioteca.service;

import com.biblioteca.dao.IdiomaDAO;
import com.biblioteca.dto.Idioma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IdiomaService {

    @Autowired
    private IdiomaDAO idiomaDAO;

    public Iterable<Idioma> mostrarTodos() {
        return this.idiomaDAO.findAll();
    }

    public Optional<Idioma> buscarPorId(Integer id){
        return this.idiomaDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.idiomaDAO.deleteById(id);
    }

    public void actualizar(Idioma idioma){
        this.idiomaDAO.save(idioma);
    }

    public void guardar(Idioma idioma){
        this.idiomaDAO.save(idioma);
    }
}
