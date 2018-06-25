package com.biblioteca.dao;

import com.biblioteca.dto.Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface LibroDAO extends CrudRepository<Libro, Integer>{

    Libro findByIsbn(String isbn);
    void deleteByIsbn(String isbn);

}
