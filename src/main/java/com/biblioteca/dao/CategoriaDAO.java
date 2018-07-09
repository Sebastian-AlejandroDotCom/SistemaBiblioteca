package com.biblioteca.dao;

import com.biblioteca.dto.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CategoriaDAO extends CrudRepository<Categoria, Integer> {
}
