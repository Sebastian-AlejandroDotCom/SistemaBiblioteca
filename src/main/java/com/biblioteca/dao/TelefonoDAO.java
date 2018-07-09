package com.biblioteca.dao;

import com.biblioteca.dto.Telefono;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TelefonoDAO extends CrudRepository<Telefono, Integer> {
}
