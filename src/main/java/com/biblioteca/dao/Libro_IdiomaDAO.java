package com.biblioteca.dao;

import com.biblioteca.dto.Libro_Idioma;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface Libro_IdiomaDAO extends CrudRepository<Libro_Idioma, Integer> {
}
