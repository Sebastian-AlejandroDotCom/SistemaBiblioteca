package com.biblioteca.service;

import com.biblioteca.dao.FacturaDAO;
import com.biblioteca.dto.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FacturaService {

    @Autowired
    private FacturaDAO facturaDAO;

    public Iterable<Factura> mostrarTodos() {
        return this.facturaDAO.findAll();
    }

    public Optional<Factura> buscarPorId(Integer id){
        return this.facturaDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.facturaDAO.deleteById(id);
    }

    public void actualizar(Factura factura){
        this.facturaDAO.save(factura);
    }

    public void guardar(Factura factura){
        this.facturaDAO.save(factura);
    }
}
