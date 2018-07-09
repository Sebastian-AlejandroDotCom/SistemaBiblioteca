package com.biblioteca.dao;

import com.biblioteca.dto.Cliente_Telefono;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface Cliente_TelefonoDAO extends CrudRepository<Cliente_Telefono, Integer> {
}
