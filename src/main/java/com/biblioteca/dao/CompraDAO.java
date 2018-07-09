package com.biblioteca.dao;

import com.biblioteca.dto.Compra;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CompraDAO  extends CrudRepository<Compra, Integer> {
}
