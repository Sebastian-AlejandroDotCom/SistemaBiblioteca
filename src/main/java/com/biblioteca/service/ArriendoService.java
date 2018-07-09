package com.biblioteca.service;

import com.biblioteca.dao.ArriendoDAO;
import com.biblioteca.dto.Arriendo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArriendoService {

    @Autowired
    private ArriendoDAO arriendoDAO;

    public Iterable<Arriendo> mostrarTodos() {
        return this.arriendoDAO.findAll();
    }

    public Optional<Arriendo> buscarPorId(Integer id) {
        return this.arriendoDAO.findById(id);
    }

    public void eliminarPorId(Integer id) {
        this.arriendoDAO.deleteById(id);
    }

    public void actualizar(Arriendo arriendo) {
        this.arriendoDAO.save(arriendo);
    }

    public void guardar(Arriendo arriendo) {
        this.arriendoDAO.save(arriendo);
    }
}
