package com.biblioteca.dao;

import com.biblioteca.dto.Trabajador_Correo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface Trabajador_CorreoDAO extends CrudRepository<Trabajador_Correo, Integer> {
}
