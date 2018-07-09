package com.biblioteca.dao;

import com.biblioteca.dto.Compra_Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface Compra_LibroDAO extends CrudRepository<Compra_Libro, Integer> {
}
