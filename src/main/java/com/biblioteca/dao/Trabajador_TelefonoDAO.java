package com.biblioteca.dao;

import com.biblioteca.dto.Trabajador_Telefono;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface Trabajador_TelefonoDAO extends CrudRepository<Trabajador_Telefono, Integer> {
}
