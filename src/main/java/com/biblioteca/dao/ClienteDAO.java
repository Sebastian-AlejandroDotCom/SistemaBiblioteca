package com.biblioteca.dao;

import com.biblioteca.dto.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ClienteDAO extends CrudRepository<Cliente, Integer> {
}
