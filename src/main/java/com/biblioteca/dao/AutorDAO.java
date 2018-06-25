package com.biblioteca.dao;


import com.biblioteca.dto.Autor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface AutorDAO extends CrudRepository<Autor, Integer> {
}
