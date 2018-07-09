package com.biblioteca.dao;

import com.biblioteca.dto.Libro_Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface Libro_CategoriaDAO extends CrudRepository<Libro_Categoria, Integer> {
}
