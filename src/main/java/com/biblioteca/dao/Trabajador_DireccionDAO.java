package com.biblioteca.dao;

import com.biblioteca.dto.Trabajador_Direccion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface Trabajador_DireccionDAO extends CrudRepository<Trabajador_Direccion, Integer> {
}
