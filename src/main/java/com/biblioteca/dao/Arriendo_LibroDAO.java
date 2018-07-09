package com.biblioteca.dao;

import com.biblioteca.dto.Arriendo_Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface Arriendo_LibroDAO extends CrudRepository<Arriendo_Libro, Integer> {
}
