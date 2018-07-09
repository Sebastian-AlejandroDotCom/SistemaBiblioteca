package com.biblioteca.dao;

import com.biblioteca.dto.Boleta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface BoletaDAO extends CrudRepository<Boleta, Integer> {
}
