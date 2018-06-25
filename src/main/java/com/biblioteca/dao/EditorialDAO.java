package com.biblioteca.dao;

import com.biblioteca.dto.Editorial;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface EditorialDAO extends CrudRepository<Editorial, Integer> {
}
