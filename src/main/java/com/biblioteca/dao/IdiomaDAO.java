package com.biblioteca.dao;

import com.biblioteca.dto.Idioma;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IdiomaDAO extends CrudRepository<Idioma, Integer> {
}
