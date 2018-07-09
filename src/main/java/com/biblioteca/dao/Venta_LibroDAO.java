package com.biblioteca.dao;

import com.biblioteca.dto.Venta_Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface Venta_LibroDAO extends CrudRepository<Venta_Libro, Integer> {
}
