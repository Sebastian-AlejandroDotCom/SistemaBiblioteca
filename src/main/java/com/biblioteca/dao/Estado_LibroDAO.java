package com.biblioteca.dao;

import com.biblioteca.dto.Estado_Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface Estado_LibroDAO extends CrudRepository<Estado_Libro, Integer> {
}
