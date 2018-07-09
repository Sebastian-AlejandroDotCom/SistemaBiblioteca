package com.biblioteca.dao;

import com.biblioteca.dto.Metodo_Pago;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface Metodo_PagoDAO extends CrudRepository<Metodo_Pago, Integer> {
}
