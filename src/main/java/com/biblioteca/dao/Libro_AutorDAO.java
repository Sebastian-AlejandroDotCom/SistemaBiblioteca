package com.biblioteca.dao;

import com.biblioteca.dto.Libro_Autor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface Libro_AutorDAO extends CrudRepository<Libro_Autor, Integer> {
}
