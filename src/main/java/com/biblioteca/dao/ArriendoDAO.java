package com.biblioteca.dao;

import com.biblioteca.dto.Arriendo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ArriendoDAO extends CrudRepository<Arriendo, Integer> {
}
