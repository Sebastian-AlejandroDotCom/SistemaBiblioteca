package com.biblioteca.dao;

import com.biblioteca.dto.Cliente_Correo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface Cliente_CorreoDAO extends CrudRepository<Cliente_Correo, Integer> {
}
