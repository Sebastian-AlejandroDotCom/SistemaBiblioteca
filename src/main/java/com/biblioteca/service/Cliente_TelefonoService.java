package com.biblioteca.service;

import com.biblioteca.dao.Cliente_TelefonoDAO;
import com.biblioteca.dto.Cliente_Telefono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Cliente_TelefonoService {

    @Autowired
    private Cliente_TelefonoDAO cliente_telefonoDAO;

    public Iterable<Cliente_Telefono> mostrarTodos() {
        return this.cliente_telefonoDAO.findAll();
    }

    public Optional<Cliente_Telefono> buscarPorId(Integer id){
        return this.cliente_telefonoDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.cliente_telefonoDAO.deleteById(id);
    }

    public void actualizar(Cliente_Telefono cliente_telefono){
        this.cliente_telefonoDAO.save(cliente_telefono);
    }

    public void guardar(Cliente_Telefono cliente_telefono){
        this.cliente_telefonoDAO.save(cliente_telefono);
    }
}
