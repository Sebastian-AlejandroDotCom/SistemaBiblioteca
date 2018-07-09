package com.biblioteca.dao;

import com.biblioteca.dto.Direccion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface DireccionDAO extends CrudRepository<Direccion, Integer> {
}
