package com.biblioteca.service;

import com.biblioteca.dao.Cliente_DireccionDAO;
import com.biblioteca.dto.Cliente_Direccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Cliente_DireccionService {

    @Autowired
    private Cliente_DireccionDAO cliente_direccionDAO;

    public Iterable<Cliente_Direccion> mostrarTodos() {
        return this.cliente_direccionDAO.findAll();
    }

    public Optional<Cliente_Direccion> buscarPorId(Integer id){
        return this.cliente_direccionDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.cliente_direccionDAO.deleteById(id);
    }

    public void actualizar(Cliente_Direccion cliente_direccion){
        this.cliente_direccionDAO.save(cliente_direccion);
    }

    public void guardar(Cliente_Direccion cliente_direccion){
        this.cliente_direccionDAO.save(cliente_direccion);
    }
}
