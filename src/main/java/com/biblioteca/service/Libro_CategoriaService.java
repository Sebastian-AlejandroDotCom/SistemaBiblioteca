package com.biblioteca.service;

import com.biblioteca.dao.Libro_CategoriaDAO;
import com.biblioteca.dto.Libro_Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Libro_CategoriaService {

    @Autowired
    private Libro_CategoriaDAO libro_categoriaDAO;

    public Iterable<Libro_Categoria> mostrarTodos() {
        return this.libro_categoriaDAO.findAll();
    }

    public Optional<Libro_Categoria> buscarPorId(Integer id){
        return this.libro_categoriaDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.libro_categoriaDAO.deleteById(id);
    }

    public void actualizar(Libro_Categoria libro_categoria){
        this.libro_categoriaDAO.save(libro_categoria);
    }

    public void guardar(Libro_Categoria libro_categoria){
        this.libro_categoriaDAO.save(libro_categoria);
    }
}
