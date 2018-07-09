package com.biblioteca.dao;

import com.biblioteca.dto.Trabajador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TrabajadorDAO extends CrudRepository<Trabajador, Integer> {
}
