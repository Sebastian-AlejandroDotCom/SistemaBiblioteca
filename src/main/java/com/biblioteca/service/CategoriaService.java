package com.biblioteca.service;

import com.biblioteca.dao.CategoriaDAO;
import com.biblioteca.dto.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaDAO categoriaDAO;

    public Iterable<Categoria> mostrarTodos() {
        return this.categoriaDAO.findAll();
    }

    public Optional<Categoria> buscarPorId(Integer id){
        return this.categoriaDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.categoriaDAO.deleteById(id);
    }

    public void actualizar(Categoria categoria){
        this.categoriaDAO.save(categoria);
    }

    public void guardar(Categoria categoria){
        this.categoriaDAO.save(categoria);
    }
}
