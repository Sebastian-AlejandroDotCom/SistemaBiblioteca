package com.biblioteca.dao;

import com.biblioteca.dto.Venta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface VentaDAO extends CrudRepository<Venta, Integer> {
}
