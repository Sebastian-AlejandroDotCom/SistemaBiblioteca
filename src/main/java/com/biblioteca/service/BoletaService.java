package com.biblioteca.service;

import com.biblioteca.dao.BoletaDAO;
import com.biblioteca.dto.Boleta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BoletaService {

    @Autowired
    private BoletaDAO boletaDAO;

    public Iterable<Boleta> mostrarTodos() {
        return this.boletaDAO.findAll();
    }

    public Optional<Boleta> buscarPorId(Integer id){
        return this.boletaDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.boletaDAO.deleteById(id);
    }

    public void actualizar(Boleta boleta){
        this.boletaDAO.save(boleta);
    }

    public void guardar(Boleta boleta){
        this.boletaDAO.save(boleta);
    }
}
