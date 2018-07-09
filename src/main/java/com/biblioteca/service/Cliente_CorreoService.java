package com.biblioteca.service;

import com.biblioteca.dao.Cliente_CorreoDAO;
import com.biblioteca.dto.Cliente_Correo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Cliente_CorreoService {

    @Autowired
    private Cliente_CorreoDAO cliente_correoDAO;

    public Iterable<Cliente_Correo> mostrarTodos() {
        return this.cliente_correoDAO.findAll();
    }

    public Optional<Cliente_Correo> buscarPorId(Integer id){
        return this.cliente_correoDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.cliente_correoDAO.deleteById(id);
    }

    public void actualizar(Cliente_Correo cliente_correo){
        this.cliente_correoDAO.save(cliente_correo);
    }

    public void guardar(Cliente_Correo cliente_correo){
        this.cliente_correoDAO.save(cliente_correo);
    }
}
