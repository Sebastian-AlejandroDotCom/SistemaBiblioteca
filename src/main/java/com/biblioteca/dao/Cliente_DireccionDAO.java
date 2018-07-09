package com.biblioteca.dao;

import com.biblioteca.dto.Cliente_Direccion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface Cliente_DireccionDAO extends CrudRepository<Cliente_Direccion, Integer> {
}
