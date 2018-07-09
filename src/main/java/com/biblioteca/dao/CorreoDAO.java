package com.biblioteca.dao;

import com.biblioteca.dto.Correo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CorreoDAO extends CrudRepository<Correo, Integer> {
}
