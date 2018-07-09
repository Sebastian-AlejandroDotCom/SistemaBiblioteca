package com.biblioteca.service;

import com.biblioteca.dao.CompraDAO;
import com.biblioteca.dto.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompraService {

    @Autowired
    private CompraDAO compraDAO;

    public Iterable<Compra> mostrarTodos() {
        return this.compraDAO.findAll();
    }

    public Optional<Compra> buscarPorId(Integer id){
        return this.compraDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.compraDAO.deleteById(id);
    }

    public void actualizar(Compra compra){
        this.compraDAO.save(compra);
    }

    public void guardar(Compra compra){
        this.compraDAO.save(compra);
    }
}
