package com.biblioteca.dao;

import com.biblioteca.dto.Factura;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface FacturaDAO extends CrudRepository<Factura, Integer> {
}
