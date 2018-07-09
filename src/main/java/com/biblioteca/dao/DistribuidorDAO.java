package com.biblioteca.dao;

import com.biblioteca.dto.Distribuidor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface DistribuidorDAO extends CrudRepository<Distribuidor, Integer> {
}
